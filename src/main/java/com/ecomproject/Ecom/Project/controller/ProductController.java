package com.ecomproject.Ecom.Project.controller;

import com.ecomproject.Ecom.Project.entity.Product;
import com.ecomproject.Ecom.Project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/home/{name}")
    public String greet(@PathVariable("name") String name) {
        return "Hello " + name;
    }


    @GetMapping("/products")
    public List<Product> getAllProducts()  {
        return productService.getAllProducts();
    }

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }
}
