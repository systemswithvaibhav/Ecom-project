package com.vaibhav.ecom_project.Service;

import com.vaibhav.ecom_project.Model.Product;
import com.vaibhav.ecom_project.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getAllProductsById(int id) {
        return repo.findById(id).orElse(null);
    }
}
