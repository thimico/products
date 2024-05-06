package com.example.productapp.service;

import com.example.productapp.model.Product;
import com.example.productapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void saveProduct(Product product) {
        this.productRepository.save(product);
    }

    public Product getProductById(long id) {
        return productRepository.findById(id).get();
    }

    public void deleteProductById(long id) {
        this.productRepository.deleteById(id);
    }
}
