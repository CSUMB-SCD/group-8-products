package edu.csumb.cst438.productservice.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.csumb.cst438.productservice.api.products.Product;

@Repository
public class ProductDbClient {

    @Autowired
    ProductRepository repository;
    
    public List<Product> getAll(){
        return repository.findAll();
    }
}