package edu.csumb.cst438.productservice.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import edu.csumb.cst438.productservice.api.products.Product;

@Repository
public class ProductDbClient {
    
    public List<Product> getAll(){
        final String uri = "https://proj-products.herokuapp.com/Product";

        RestTemplate restTemplate = new RestTemplate();
        List<Product> result = restTemplate.getForObject(uri, List.class);
    
        return result;
    }
}