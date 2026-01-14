package com.example.Spring.Boot.Practice.Service;


import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String buildMessage (String name){
        return "Hello " + name;
    }
}
