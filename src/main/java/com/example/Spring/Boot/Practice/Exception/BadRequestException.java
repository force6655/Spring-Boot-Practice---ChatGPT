package com.example.Spring.Boot.Practice.Exception;

public class BadRequestException extends RuntimeException {

    public BadRequestException(String message)  {
        super(message);
    }
}

