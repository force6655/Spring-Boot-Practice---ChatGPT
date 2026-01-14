package com.example.Spring.Boot.Practice.Controller;

import com.example.Spring.Boot.Practice.Model.Model;
import com.example.Spring.Boot.Practice.Service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping ("/add")
    public Model addNumber(@RequestParam int numA, @RequestParam int numB){
        return new Model("Result adding shows " +String.valueOf(calculatorService.add(numA,numB)),"success");
    }

    @GetMapping ("/subtract")
    public Model subtractNumber(@RequestParam int numA, @RequestParam int numB){
        return new Model("Result subtracting shows " +String.valueOf(calculatorService.subtract(numA,numB)),"success");
    }

    @GetMapping ("/multiply")
    public Model multiplyNumber(@RequestParam int numA, @RequestParam int numB){
        return new Model("Result multiplying shows " +String.valueOf(calculatorService.multiply(numA,numB)),"success");
    }

    @GetMapping ("/divide")
    public Model divideNumber(@RequestParam int numA, @RequestParam int numB){
        return new Model("Result dividing shows " +String.valueOf(calculatorService.divide(numA,numB)),"success");
    }
}
