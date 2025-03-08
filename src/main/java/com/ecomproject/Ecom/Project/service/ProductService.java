package com.ecomproject.Ecom.Project.service;


import com.ecomproject.Ecom.Project.entity.Product;
import com.ecomproject.Ecom.Project.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product addProduct (Product product) {
        return productRepo.save(product);
    }
}
