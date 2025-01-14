package com.nishikant.simpleWebapp.service;

import com.nishikant.simpleWebapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    List<Product> products = new ArrayList<Product>(Arrays.asList(new Product(101, "Iphone", 50000), new Product(102, "Ipad", 100000), new Product(103, "Ipen", 10000)));

    public List<Product> getProducts() {
        return products;
    }

    public Optional<Product> getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProductId() == prodId)
                .findFirst();
    }

    public Product addProduct(Product prod) {
        products.add(prod);
        return prod;
    }

    public Product updateProduct(Product prod) {
        int index = 0;
        for(int i =0; i < products.size(); i++) {
            if(products.get(i).getProductId() == prod.getProductId()) {
                index = i;
            }
        }
        products.set(index, prod);
        return prod;
    }

    public void deleteProduct(int prodId) {
        int index = 0;
        for(int i =0; i < products.size(); i++) {
            if(products.get(i).getProductId() == prodId) {
                index = i;
            }
        }
        products.remove(index);
    }
}
