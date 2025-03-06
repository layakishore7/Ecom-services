package com.ecomproject.Ecom.Project.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @RequestMapping("/home/{name}")
    public String greet(@PathVariable("name") String name) {
        return "Hello " + name;
    }
}
