package edu.csumb.cst438.productservice.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.csumb.cst438.productservice.api.products.Payload;
import edu.csumb.cst438.productservice.api.products.Product;
import edu.csumb.cst438.productservice.data.ProductDbClient;

@Service
public class Manager{
    @Autowired
    ProductDbClient productDbClient;
    
    public List<Product> getProductList(){
        return productDbClient.getAll();
    }

    public boolean removeStock(Payload payload) throws Exception {
        payload.product.stock = payload.product.stock - payload.amount;
        return productDbClient.save(payload.product);
        
    }
}