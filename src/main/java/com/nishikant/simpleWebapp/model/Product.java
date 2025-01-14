package com.nishikant.simpleWebapp.model;

import org.springframework.stereotype.Component;

@Component
public class Product {

    public Product() {

    }

    public Product(int productId, String prodName, int price) {
        this.productId = productId;
        this.prodName = prodName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int productId;
    private String prodName;
    private int price;


}
