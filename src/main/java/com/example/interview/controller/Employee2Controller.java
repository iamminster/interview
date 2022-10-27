package com.example.interview.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee2Controller {

    @GetMapping(path = "employee/{id}")
    public String getEmployeeByID(@PathVariable(name = "id") int id) {
        return getName(id);
    }

    private String getName(int id) {
        if (id == 1) {
            return "Minh";
        }
        if (id == 2) {
            return "Hue";
        }
        if (id == 3) {
            return "Long";
        }
        return "Not found";
    }
}
