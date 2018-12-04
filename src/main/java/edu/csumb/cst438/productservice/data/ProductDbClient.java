package edu.csumb.cst438.productservice.data;

import java.util.List;
import java.util.Optional;

import com.mongodb.MongoClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Update.update;
import static org.springframework.data.mongodb.core.query.Query.query;
import org.springframework.stereotype.Repository;

import edu.csumb.cst438.productservice.api.products.Payload;
import edu.csumb.cst438.productservice.api.products.Product;

@Repository
public class ProductDbClient {

    @Autowired
    ProductRepository repository;
    
    public List<Product> getAll(){
        return repository.findAll();
    }

	public boolean save(Product newProduct) {
        repository.save(newProduct);
		return true;
	}
}