package com.pedroacbg.catalog.service;

import com.pedroacbg.catalog.model.Category;
import com.pedroacbg.catalog.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> getAllCategories(){
        return repository.findAll();
    }


}
