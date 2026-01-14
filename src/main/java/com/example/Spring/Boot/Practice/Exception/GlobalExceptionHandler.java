package com.example.Spring.Boot.Practice.Exception;

import com.example.Spring.Boot.Practice.Model.Model;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Model handleBadRequest(BadRequestException ex) {
        return new Model(ex.getMessage(), "error");
    }
}
