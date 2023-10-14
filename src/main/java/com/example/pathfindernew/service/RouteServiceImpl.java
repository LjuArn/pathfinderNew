package com.example.pathfindernew.service;

import com.example.pathfindernew.domain.entity.RouteEntity;
import com.example.pathfindernew.domain.serviceModel.RouteServiceModel;
import com.example.pathfindernew.domain.viewModel.RouteDetailsViewModel;
import com.example.pathfindernew.domain.viewModel.RouteViewModel;
import com.example.pathfindernew.repository.RouteRepository;
import com.example.pathfindernew.util.CurrentUser;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RouteServiceImpl implements RouteService {

    private final RouteRepository routeRepository;
    private final UserService userService;
    private final CurrentUser currentUser;
    private final CategoryService categoryService;
    private final ModelMapper modelMapper;

    public RouteServiceImpl(RouteRepository routeRepository,
                            UserService userService,
                            CurrentUser currentUser,
                            CategoryService categoryService,
                            ModelMapper modelMapper) {
        this.routeRepository = routeRepository;
        this.userService = userService;
        this.currentUser = currentUser;
        this.categoryService = categoryService;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<RouteViewModel> findAllRoutesViewModels() {
        return routeRepository
                .findAll()
                .stream()
                .map(routeEntity -> {

                    RouteViewModel routeViewModel = modelMapper.map(routeEntity, RouteViewModel.class);

                    if (routeEntity.getPictures().isEmpty()) {
                        routeViewModel.setPicture("/images/pic4.jpg");
                    } else {
                        routeViewModel.setPicture(routeEntity.getPictures().stream().findFirst().get().getUrl());
                    }
                    return routeViewModel;
                })
                .collect(Collectors.toList());
    }

    @Override
    public boolean isNameExistMethod(String name) {
        return routeRepository.findByName(name).isPresent();
    }

    @Override
    public void addNewRoute(RouteServiceModel routeServiceModel) {

        RouteEntity route = modelMapper.map(routeServiceModel, RouteEntity.class);
        route.setAuthor(userService.findCurrentLoginUser());
        route.setCategories(routeServiceModel
                .getCategories()
                .stream()
                .map(categoryNameEnum -> categoryService.findCathegoryByName(categoryNameEnum))
                .collect(Collectors.toSet()));



        routeRepository.save(route);
    }

    @Override
    public RouteDetailsViewModel findRouteById(Long id) {
        return routeRepository.findById(id)
                .map(routeEntity -> modelMapper.map(routeEntity,RouteDetailsViewModel.class))
                .orElse(null);
    }
}
