package edu.csumb.cst438.productservice.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.csumb.cst438.productservice.api.products.Catagory;
import edu.csumb.cst438.productservice.api.products.Manufacturer;
import edu.csumb.cst438.productservice.api.products.Product;
import edu.csumb.cst438.productservice.data.ProductRepository;

@Component
public class ProductDbSeeder implements CommandLineRunner{

    @Autowired
	ProductRepository productRepo;

    @Override
    public void run(String... args) throws Exception {
        //catagories
        Catagory CPU = new Catagory("CPU", "Central Processing Unit");
        //manufacturers
        Manufacturer AMD = new Manufacturer("AMD", "Advanced Micro Devices, Inc.");
        //products
        Product ryzen3 = new Product("ryzen 3", "Most affordable ryzen processor", 10, 99.99, CPU, AMD);
        Product ryzen5 = new Product("ryzen 5", "Middle ground ryzen processor", 10, 159.99, CPU, AMD);
        Product ryzen7 = new Product("ryzen 7", "Highest performence ryzen processor", 10, 309.99, CPU, AMD);

        productRepo.deleteAll();
        List<Product> products = Arrays.asList(ryzen3, ryzen5, ryzen7);
        productRepo.saveAll(products);
    }

}