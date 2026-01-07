package com.pedroacbg.catalog.service;

import com.pedroacbg.catalog.model.Product;
import com.pedroacbg.catalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getAllProducts(){
        return repository.findAll();
    }

    public List<Product> getProductByCategory(Long categoryId){
        return repository.findByCategoryId(categoryId);
    }

}
