package com.example.Spring.Boot.Practice.Controller;

import com.example.Spring.Boot.Practice.Service.HelloService;
import com.example.Spring.Boot.Practice.Model.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public Model hello(@RequestParam(required = false, defaultValue = "World") String name) {
        return new Model(helloService.buildMessage(name), "success");
    }

    @GetMapping("/{name}")
    public Model getMessage(@PathVariable String name) {

        return new Model(helloService.buildMessage(name), "success");
    }
}


