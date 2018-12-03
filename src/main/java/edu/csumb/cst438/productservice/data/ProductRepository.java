package edu.csumb.cst438.productservice.data;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import edu.csumb.cst438.productservice.api.products.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
    @Query (value = "{'id':?0}")
    Product findByRepoId(String id);

    @Query (value = "{'Name':?0}")
    List<Product> findByName(String Name);


}