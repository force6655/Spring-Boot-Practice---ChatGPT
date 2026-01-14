package com.example.Spring.Boot.Practice.Controller;

import com.example.Spring.Boot.Practice.Service.GreetingService;
import com.example.Spring.Boot.Practice.Model.Model;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/greet")

public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping ("/hello")
//    public Model defaultSayHello(@RequestParam(required = false, defaultValue = "World") String name) {
    public Model defaultSayHello(@RequestParam() String name) {
        return new Model(greetingService.hello(name), "success");
    }

    @GetMapping ("/hello/{name}")
    public Model sayHello(@PathVariable String name) {
        return new Model(greetingService.hello(name), "success");
    }

    @GetMapping ("/goodbye")
    public Model defaultSayGoodbye(@RequestParam(required = false, defaultValue = "World") String name){
        return new Model(greetingService.goodbye(name),"success");
    }

    @GetMapping ("/goodbye/{name}")
    public Model sayGoodbye(@PathVariable String name) {
        return new Model(greetingService.goodbye(name), "success");
    }

}


