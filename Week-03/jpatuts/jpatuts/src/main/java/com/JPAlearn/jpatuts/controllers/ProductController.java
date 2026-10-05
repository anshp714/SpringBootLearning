package com.JPAlearn.jpatuts.controllers;
import com.JPAlearn.jpatuts.entities.ProductEntity;
import com.JPAlearn.jpatuts.repositories.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<ProductEntity> getAllProducts(){
        return productRepository.findByOrderByPrice();
    }
}
