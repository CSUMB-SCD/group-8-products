package edu.csumb.cst438.productservice.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import edu.csumb.cst438.productservice.api.products.Payload;
import edu.csumb.cst438.productservice.api.products.Product;
import edu.csumb.cst438.productservice.business.Manager;

@RestController
public class ProductController {
    @Autowired
    Manager manager;

    @CrossOrigin
    @GetMapping ("/Product")
    @ResponseBody
    List<Product> getProducts(){
        return manager.getProductList();
    }

    @CrossOrigin
    @RequestMapping(value="/removeStock", method = RequestMethod.POST)
    public List<Boolean> removeStock(@RequestBody Payload payload) throws Exception {
        ArrayList<Boolean> result = new ArrayList<Boolean>();
        result.add(manager.removeStock(payload));
        return result;        
    }

    @GetMapping("/")
    public String home() {
        return "This is a trivial service that demonstrates how a Eureka Client can register with a Eureka Server";
    }
}