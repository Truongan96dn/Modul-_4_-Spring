package com.example.shoppingcart.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cart {
    private LinkedHashMap<Product, Integer> products = new LinkedHashMap<>();

    public Cart() {
    }

    public Cart(LinkedHashMap<Product, Integer> products) {
        this.products = products;
    }

    public LinkedHashMap<Product, Integer> getProducts() {
        return products;
    }

    private boolean checkItemInCart(Product product) {
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            if (entry.getKey().getId().equals(product.getId())) {
                return true;
            }
        }
        return false;
    }

    private Map.Entry<Product, Integer> selectItemInCart(Product product) {
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            if (entry.getKey().getId().equals(product.getId())) {
                return entry;
            }
        }
        return null;
    }

    public void addProduct(Product product) {
        if (!checkItemInCart(product)) {
            products.put(product, 1);
        } else {
            Map.Entry<Product, Integer> itemEntry = selectItemInCart(product);
            Integer newQuantity = itemEntry.getValue() + 1;
            products.replace(itemEntry.getKey(), newQuantity);
        }
    }
    public void deleteProductCart(Product product) {
        Map.Entry<Product, Integer> productEntry = selectItemInCart(product);
        if (productEntry.getValue() > 0) {
            Integer quantity = productEntry.getValue() - 1;
            products.replace(productEntry.getKey(), quantity);
            if (quantity == 0) {
                products.remove(productEntry.getKey());
            }
        }
    }

    public Integer countProductQuantity() {
        Integer productQuantity = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            productQuantity += entry.getValue();
        }
        return productQuantity;
    }

    public Integer countItemQuantity() {
        return products.size();

    }

    public Float countTotalPayment() {
        float payment = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            payment += entry.getKey().getPrice() * (float) entry.getValue();
        }
        return payment;
    }
}

