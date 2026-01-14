package com.example.Spring.Boot.Practice.Model;

import java.util.Objects;

public class Model {
    //variable of return API
    private String message;
    private String status;

    //constructor
    public Model(String message, String status) {
        this.message = message;
        this.status = status;
    }

    @Override
    public boolean equals(Object o)  {
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return Objects.equals(message, model.message) && Objects.equals(status, model.status);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, status);
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }
}
