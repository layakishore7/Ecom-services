package com.ecomproject.Ecom.Project.repository;

import com.ecomproject.Ecom.Project.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
}
