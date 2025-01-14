package com.nishikant.simpleWebapp.service;

import com.nishikant.simpleWebapp.model.Product;
import com.nishikant.simpleWebapp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

//    List<Product> products = new ArrayList<Product>(Arrays.asList(new Product(101, "Iphone", 50000), new Product(102, "Ipad", 100000), new Product(103, "Ipen", 10000)));

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Optional<Product> getProductById(int prodId) {
        return repo.findById(prodId);
    }

    public Product addProduct(Product prod) {
        repo.save(prod);
        return prod;
    }

    public Product updateProduct(Product prod) {
        repo.save(prod);
        return prod;
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
