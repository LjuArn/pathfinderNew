package com.example.pathfindernew.web;


import com.example.pathfindernew.domain.bindingModel.RoateAddBindingModel;
import com.example.pathfindernew.domain.serviceModel.RouteServiceModel;
import com.example.pathfindernew.service.RouteService;
import com.example.pathfindernew.service.UserService;
import com.example.pathfindernew.util.CurrentUser;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;

@Controller
@RequestMapping("/routes")
public class RouteController {

    private final RouteService routeService;
    //private final UserService userService;
    private final CurrentUser currentUser;
    private final ModelMapper modelMapper;


    public RouteController(RouteService routeService, UserService userService, CurrentUser currentUser, ModelMapper modelMapper) {
        this.routeService = routeService;
        //this.userService = userService;
        this.currentUser = currentUser;
        this.modelMapper = modelMapper;
    }


    @GetMapping("/all")
    public String allRoutes(Model model) {

        model.addAttribute("routes", routeService.findAllRoutesViewModels());
        return "routes";
    }


    @GetMapping("/details/{id}")
    public String details(@PathVariable Long id, Model model) {


        model.addAttribute("route", routeService.findRouteById(id));
        model.addAttribute("authorName", routeService.findRouteById(id).getAuthor().getUsername());

        return "route-details";
    }

    @GetMapping("/add")
    public String add(Model model) {


        if (currentUser.getId() == null) {
            return "redirect:users/login";
        }

        if (!model.containsAttribute("roateAddBindingModel")) {
            model.addAttribute("roateAddBindingModel", new RoateAddBindingModel());
        }

        return "add-route";
    }


    @PostMapping("/add")
    public String addConfurm(@Valid RoateAddBindingModel roateAddBindingModel,
                             BindingResult bindingResult,
                             RedirectAttributes redirectAttributes) throws IOException {

        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("roateAddBindingModel", roateAddBindingModel)
                    .addFlashAttribute("org.springframework.validation.BindingResult.roateAddBindingModel", bindingResult);
            return "redirect:add";
        }


        boolean isNameRouteExist = routeService.isNameExistMethod(roateAddBindingModel.getName());

        if (isNameRouteExist) {
            redirectAttributes.addFlashAttribute("isNameRouteExist", true)
                    .addFlashAttribute("roateAddBindingModel", roateAddBindingModel)
                    .addFlashAttribute("org.springframework.validation.BindingResult.roateAddBindingModel",
                            bindingResult);
            return "redirect:add";
        }

        RouteServiceModel routeServiceModel = modelMapper.map(roateAddBindingModel, RouteServiceModel.class);

        routeServiceModel.setGpxCoordinates(new String(roateAddBindingModel.getGpxCoordinates().getBytes()));
        routeService.addNewRoute(routeServiceModel);


        return "redirect:all";
    }


}
