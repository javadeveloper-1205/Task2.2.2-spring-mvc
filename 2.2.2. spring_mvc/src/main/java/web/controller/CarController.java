package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.carService.CarServiceImpl;

import javax.annotation.Resource;


@Controller

public class CarController {
    @Autowired
    private CarServiceImpl carService;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer countCars, Model model) {
        model.addAttribute("listCars", carService.numbers(countCars));
        return "cars";
    }
}
