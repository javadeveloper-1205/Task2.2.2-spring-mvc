package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.carService.CarService;


@Controller

public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public Model printCars(@RequestParam(value = "count", required = false) Integer countCars, Model modelAndView) {
        modelAndView.addAttribute("listCars", carService.numbers(countCars));
        return modelAndView;
    }
}
