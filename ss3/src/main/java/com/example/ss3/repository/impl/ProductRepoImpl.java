package com.example.ss3.repository;

import com.example.ss3.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepoImpl implements IProductRepo{
    private static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1,"Iphone 11",500,"Black","Apple"));
        productList.add(new Product(2,"Iphone 12",550,"White","Apple"));
        productList.add(new Product(3,"Iphone 13",600,"Gray","Apple"));
        productList.add(new Product(4,"Iphone 14",1000,"Cyan","Apple"));
    }
    @Override
    public List<Product> getAll() {
        return productList;
    }

    @Override
    public void createProduct(Product product) {
      productList.add(product);
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if(id == productList.get(i).getProductId()){
                productList.remove(productList.get(i));
            }
        }
    }

    @Override
    public void update(Product product) {
        for (int i = 0; i <productList.size() ; i++) {
            if(product.getProductId()== productList.get(i).getProductId()){
                productList.set(i,product);
            }
        }
    }

    @Override
    public Product findById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if ((id == productList.get(i).getProductId())){
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if(name.equals(productList.get(i).getProductName())){
                products.add(productList.get(i));
            }

        }
        return products;
    }
}
