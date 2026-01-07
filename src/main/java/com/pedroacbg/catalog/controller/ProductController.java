package com.pedroacbg.catalog.controller;

import com.pedroacbg.catalog.model.Product;
import com.pedroacbg.catalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/category/{categoryId}")
    public List<Product> getAllProductsById(@PathVariable Long categoryId){
        return service.getProductByCategory(categoryId);
    }
}
