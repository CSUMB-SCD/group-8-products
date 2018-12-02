package edu.csumb.cst438.productservice.api.products;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Product {

    @Id
    public String id;

    public String name;
    public String description;
    public int stock;
    public double price;
    public Catagory catagory;
    public Manufacturer manufacturer;
    public String lo_rez;
    public List<String> hi_rez;

    public Product() {}

    public Product(String name, String description, int stock, double price, Catagory catagory, Manufacturer manufacturer, String lo_rez) {
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.price = price;
        this.catagory = catagory;
        this.manufacturer = manufacturer;
        this.lo_rez = lo_rez;
    }

    public Product(String name, String description, int stock, double price, Catagory catagory, Manufacturer manufacturer, String lo_rez, ArrayList<String> hi_rez) {
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.price = price;
        this.catagory = catagory;
        this.manufacturer = manufacturer;
        this.lo_rez = lo_rez;
        this.hi_rez = hi_rez;
    }

    @Override
    public String toString() {
        return null;
    }

}