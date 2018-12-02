package edu.csumb.cst438.productservice.data;

import java.util.List;

import com.mongodb.MongoClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

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

	public boolean removeStock(Payload payload) {
        MongoOperations mongoOps = new MongoTemplate(new SimpleMongoDbFactory(new MongoClient(), "database"));
        mongoOps.updateFirst(query(where("id").is(payload.product.id)), update("age", 35), Product.class);
		return false;
	}


}