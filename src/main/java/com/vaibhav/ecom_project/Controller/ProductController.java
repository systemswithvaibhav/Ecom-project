package com.vaibhav.ecom_project.Controller;

import com.vaibhav.ecom_project.Model.Product;
import com.vaibhav.ecom_project.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String greet() {
        return "Hello World";
    }

    @GetMapping("/products")
    public ResponseEntity <List<Product>> getAllProducts() {
        return new ResponseEntity<>( service.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity <Product> getProduct(@PathVariable int id) {

        Product product = service.getAllProductsById( id);

        if (product != null) {
            return new ResponseEntity<>(product, HttpStatus.OK);
        }
        else  {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
