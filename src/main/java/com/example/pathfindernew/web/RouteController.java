package com.example.pathfindernew.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/routes")
public class RouteController {


    @GetMapping()
    public String routes(){
        return "routes";
    }

    @GetMapping("/add")
    public String add() {

        return "add-route";
    }


}
