package com.pedroacbg.catalog.config;

import com.pedroacbg.catalog.model.Category;
import com.pedroacbg.catalog.model.Product;
import com.pedroacbg.catalog.repository.CategoryRepository;
import com.pedroacbg.catalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        // Limpa todos os dados existentes
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        // cria as categorias
        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category home = new Category();
        home.setName("Home & Kitchen");

        categoryRepository.saveAll(Arrays.asList(electronics, clothing, home));

        // cria os produtos
        Product phone = new Product();
        phone.setName("Iphone 20");
        phone.setDescription("Latest iphone model");
        phone.setImgUrl("https://i.pinimg.com/originals/50/7f/7f/507f7f0d5f964a8fb2a572e747477bef.jpg");
        phone.setPrice(2000.00);
        phone.setCategory(electronics);

        Product laptop = new Product();
        laptop.setName("Laptop GAMER");
        laptop.setDescription("Best laptop to play fortnite");
        laptop.setImgUrl("https://i.pinimg.com/originals/50/7f/7f/507f7f0d5f964a8fb2a572e747477bef.jpg");
        laptop.setPrice(3000.00);
        laptop.setCategory(electronics);

        Product jacket = new Product();
        jacket.setName("Winter jacket");
        jacket.setDescription("Best jacket to play fortnite warm");
        jacket.setImgUrl("https://i.pinimg.com/originals/50/7f/7f/507f7f0d5f964a8fb2a572e747477bef.jpg");
        jacket.setPrice(199.99);
        jacket.setCategory(clothing);

        Product blender = new Product();
        blender.setName("Blender");
        blender.setDescription("Best blender to make smoothies");
        blender.setImgUrl("https://i.pinimg.com/originals/50/7f/7f/507f7f0d5f964a8fb2a572e747477bef.jpg");
        blender.setPrice(59.99);
        blender.setCategory(home);

        productRepository.saveAll(Arrays.asList(phone, laptop, jacket, blender));
    }
}
