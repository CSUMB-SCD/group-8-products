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
        Catagory GPU = new Catagory("GPU", "Graphics Processing Unit");
        Catagory Memory = new Catagory("Memory", "Random Access Memory");
        //manufacturers
        Manufacturer AMD = new Manufacturer("AMD", "Advanced Micro Devices, Inc.");
        Manufacturer Intel = new Manufacturer("Intel", "Intel Semiconductor manufacturing company");
        Manufacturer GSkill = new Manufacturer("GSkill", "G.Skill Computer hardware company");
        Manufacturer Corsair = new Manufacturer("Corsair", "Corsair Components Computer hardware company");
        //products
        Product ryzen3 = new Product("ryzen 3", "Most affordable ryzen processor", 10, 99.99, CPU, AMD, "https://i.imgur.com/bDuAH8E.jpg");
        Product ryzen5 = new Product("ryzen 5", "Middle ground ryzen processor", 10, 159.99, CPU, AMD, "https://i.imgur.com/Yu8JjTG.jpg");
        Product ryzen7 = new Product("ryzen 7", "Highest performence ryzen processor", 10, 309.99, CPU, AMD, "https://i.imgur.com/q0slPAN.jpg");
        
        Product i3 = new Product("i3", "Most affordable intel processor", 10, 129.99, CPU, Intel, "https://i.imgur.com/3AEeS0W.jpg");
        Product i5 = new Product("i5", "Middle ground intel processor", 10, 219.99, CPU, Intel, "https://i.imgur.com/nNstQ3R.jpg");
        Product i7 = new Product("i7", "Highest performence intel processor", 10, 319.99, CPU, Intel, "https://i.imgur.com/iVyPh0k.jpg");

        Product rxvega = new Product("Radeon RX Vega", "Built for Extreme Gamers", 10, 439.99, GPU, AMD, "https://i.imgur.com/1T7P5iC.jpg");
        Product rx590 = new Product("Radeon RX 590", "High Performance Gaming", 10, 279.99, GPU, AMD, "https://i.imgur.com/nl0qTKC.png");
        Product rx480 = new Product("Radeon RX 480", "We’ve re-imagined everything a gaming card can and should be and made it even more accessible than ever. You can play the latest eSports titles, the most popular AAA games, and experience the next level of immersion with exceptional VR.",
        10, 89.99, GPU, AMD, "https://i.imgur.com/8TaNgV3.png");

        Product geforcertx2080 = new Product("GeForce RTX 2080", " ", 10, 749.99, GPU, Intel, "https://i.imgur.com/1RqLEZ9.png");

        Product ripjawsV2x4 = new Product("Ripjaws V Series 8GB", "(2 x 4GB) 288-Pin DDR4 SDRAM DDR4 3200 (PC4 25600)", 10, 79.99, Memory, GSkill, "https://i.imgur.com/vQ44m2X.jpg");
        Product VengeanceLPX2x8 = new Product("Vengeance LPX 16GB", "(2 x 8GB) 288-Pin DDR4 SDRAM DDR4 3000 (PC4 24000) ", 10, 129.99, Memory, Corsair, "https://i.imgur.com/2q0kdvM.jpg");
        Product VengeanceRGBPro4x8 = new Product("Vengeance RGB Pro 32GB", "(4 x 8GB) 288-Pin DDR4 DRAM DDR4 3000 (PC4 24000)", 10, 299.99, Memory, Corsair, "https://i.imgur.com/Zv3rugZ.jpg");

        productRepo.deleteAll();
        List<Product> products = Arrays.asList(ryzen3, ryzen5, ryzen7, i3, i5, i7, rxvega, rx590, rx480, geforcertx2080, ripjawsV2x4, VengeanceLPX2x8, VengeanceRGBPro4x8);
        productRepo.saveAll(products);
    }

}