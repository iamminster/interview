package com.example.interview.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @RequestMapping(method = RequestMethod.GET, path = "/employee1{id}")
    public String getEmployee(@PathVariable int id) {
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
