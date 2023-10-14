package com.example.pathfindernew.service;

import com.example.pathfindernew.domain.serviceModel.RouteServiceModel;
import com.example.pathfindernew.domain.viewModel.RouteDetailsViewModel;
import com.example.pathfindernew.domain.viewModel.RouteViewModel;

import java.util.List;

public interface RouteService {
    List<RouteViewModel> findAllRoutesViewModels();

    boolean isNameExistMethod(String name);

    void addNewRoute(RouteServiceModel routeServiceModel);

    RouteDetailsViewModel findRouteById(Long id);
}
