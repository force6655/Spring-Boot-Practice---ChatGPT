package com.example.Spring.Boot.Practice.Service;

import com.example.Spring.Boot.Practice.Exception.BadRequestException;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String hello(String name){
        if (name == null || name.isBlank()) {
            throw new BadRequestException("Name cannot be empty");
        }
        return "Hello " + name;
    }

    @Override
    public String goodbye(String name){
        if (name == null || name.isBlank()) {
            throw new BadRequestException("Name cannot be empty");
        }
        return "Goodbye "+ name;
    }
}
