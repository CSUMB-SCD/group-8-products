package edu.csumb.cst438.productservice.data;

import java.util.Arrays;
import java.util.ArrayList;
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
        ArrayList<String> ryzen3Hi = new ArrayList<String>();
        ArrayList<String> ryzen5Hi = new ArrayList<String>();
        ArrayList<String> ryzen7Hi = new ArrayList<String>();
        ryzen3Hi.add("https://i.imgur.com/NLiFuuq.jpg");
        ryzen3Hi.add("https://i.imgur.com/zqSuNr7.jpg");
        ryzen3Hi.add("https://i.imgur.com/pZIpKq9.jpg");

        ryzen5hi.add("https://i.imgur.com/Vgeo3kw.jpg");
        ryzen5hi.add("https://i.imgur.com/lE5sih4.jpg");
        ryzen5hi.add("https://i.imgur.com/jUAXQqk.jpg");

        ryzen7hi.add("https://i.imgur.com/5yLnpkr.jpg");
        ryzen7hi.add("https://i.imgur.com/jjzmkwP.jpg");
        ryzen7hi.add("https://i.imgur.com/mV3M8ag.jpg");

        ArrayList<String> i3i = new ArrayList<String>();
        ArrayList<String> i5i = new ArrayList<String>();
        ArrayList<String> i7i = new ArrayList<String>();
		
        i3i.add("https://i.imgur.com/vgQDoPM.jpg");
        i3i.add("https://i.imgur.com/3DWPKST.jpg");
        i3i.add("https://i.imgur.com/qsYbJgY.jpg");
        i5i.add("https://i.imgur.com/sXwIN6v.jpg");
        i5i.add("https://i.imgur.com/W17KhcA.jpg");
        i5i.add("https://i.imgur.com/tmDDZ5J.jpg");		
        i7i.add("https://i.imgur.com/fsKSCu7.jpg");
        i7i.add("https://i.imgur.com/daucpue.jpg");
        i7i.add("https://i.imgur.com/oNfoh3h.jpg");

		
        ArrayList<String> rxvegai = new ArrayList<String>();
        ArrayList<String> rx590i = new ArrayList<String>();
        ArrayList<String> rx480i = new ArrayList<String>();
		
        rxvegai.add("https://i.imgur.com/zrPYHNo.jpg");
        rxvegai.add("https://i.imgur.com/fKJKisS.jpg");
        rxvegai.add("https://i.imgur.com/jOs5rhv.jpg");

        rx590i.add("https://i.imgur.com/djobXEE.jpg");
        rx590i.add("https://i.imgur.com/43Rc4Mu.jpg");
        rx590i.add("https://i.imgur.com/5EGgvXl.jpg");
		
        rx480i.add("https://i.imgur.com/WaGejd9.jpg");
        rx480i.add("https://i.imgur.com/xg2Xnxp.png");
        rx480i.add("https://i.imgur.com/d6vdAOk.jpg");

		
        ArrayList<String> geforcertx2080i = new ArrayList<String>();		
        geforcertx2080i.add("https://i.imgur.com/qSkQYv5.jpg");
        geforcertx2080i.add("https://i.imgur.com/SbHSP8f.jpg");
        geforcertx2080i.add("https://i.imgur.com/SbHSP8f.jpg");

        ArrayList<String> ripjawsV2x4i = new ArrayList<String>();		
        ripjawsV2x4i.add("https://i.imgur.com/9NA41Su.jpg");
        ripjawsV2x4i.add("https://i.imgur.com/N2Hz4lj.png");
        ripjawsV2x4i.add("https://i.imgur.com/nP4IDCf.jpg");

        ArrayList<String> VengeanceLPX2x8i = new ArrayList<String>();
        VengeanceLPX2x8i.add("https://i.imgur.com/m28pEvB.jpg");
        VengeanceLPX2x8i.add("https://i.imgur.com/0tE7w7e.jpg");
        VengeanceLPX2x8i.add("https://i.imgur.com/Q0bbjzM.jpg");

        ArrayList<String> VengeanceRGBPro4x8i = new ArrayList<String>();
        VengeanceRGBPro4x8i.add("https://i.imgur.com/sBAT9zn.jpg");
        VengeanceRGBPro4x8i.add("https://i.imgur.com/fHFoFrW.jpg");
        VengeanceRGBPro4x8i.add("https://i.imgur.com/lprbi44.png");

        Product ryzen3 = new Product("ryzen 3", "Ryzen 3 is a family of low-end performance 64-bit quad-core x86 microprocessors introduced by AMD in late-2017. Ryzen 3 is based on the Zen microarchitecture and is manufactured on GF's 14 nm process. Ryzen 3 is marketed toward the low-end performance market. The Ryzen 3 is positioned against Intel's low-end mainstream Core i3 processors, offering competitive performance at lower prices", 10, 99.99, CPU, AMD, "https://i.imgur.com/bDuAH8E.jpg", ryzen3Hi);
        Product ryzen5 = new Product("ryzen 5", "Ryzen 5 is a family of mid-range performance 64-bit quad and hexa-cores x86 microprocessors introduced by AMD in March of 2017. Ryzen 5 is based on the Zen microarchitecture and is manufactured on GF's 14 nm process. Ryzen 5 is marketed toward the mid-range performance market. The Ryzen 5 is positioned against Intel's mid-range mainstream Core i5 processors, offering competitive performance at lower prices.", 10, 159.99, CPU, AMD, "https://i.imgur.com/Yu8JjTG.jpg", ryzen5Hi);
        Product ryzen7 = new Product("ryzen 7", "Ryzen 7 is a family of high-performance 64-bit octa-core x86 microprocessors introduced by AMD in 2017 as a successor to the FX family. Ryzen 7 is based on the Zen microarchitecture and is manufactured on GF's 14 nm process. Ryzen 7 is marketed toward the high-end enthusiasts desktop market offering the highest level of performance. The Ryzen 7 is positioned against Intel's high-end Core i7 processors, offering competitive performance at lower prices.", 10, 309.99, CPU, AMD, "https://i.imgur.com/q0slPAN.jpg", ryzen7Hi);
        
        Product i3 = new Product("i3", "Core i3 is family of low-end performance processors introduced by Intel since 2010, following the retirement of the Core 2 family.", 10, 129.99, CPU, Intel, "https://i.imgur.com/3AEeS0W.jpg", i3i);
        Product i5 = new Product("i5", "Core i5 is family of mid-range performance 64-bit x86 processors designed by Intel for desktops and laptops. The Core i5 family was introduced by Intel in 2009, following the retirement of the Core 2 family. Core i5 microprocessors are positioned between the high-end performance Core i7 and the low-end performance Core i3.",  10, 219.99, CPU, Intel, "https://i.imgur.com/nNstQ3R.jpg", i5i);
        Product i7 = new Product("i7", "Core i7 is a family of high-end performance 64-bit x86-64 processors designed by Intel for high-end desktops and laptops. Core i7 was introduced in 2008 following the retirement of the Core 2 Quad family. Core i7 microprocessors are the high-end brand from the Core family, positioned above both the Core i5 and the Core i3.", 10, 319.99, CPU, Intel, "https://i.imgur.com/iVyPh0k.jpg", i7i);

        Product rxvega = new Product("Radeon RX Vega", "Built for Extreme Gamers, Powered by the “Vega” architecture.", 10, 439.99, GPU, AMD, "https://i.imgur.com/1T7P5iC.jpg", rxvegai);
        Product rx590 = new Product("Radeon RX 590", "AMD Radeon™ RX 590 Graphics Cards Deliver Leading-Edge, Smooth HD Gaming Experience for Latest Games", 10, 279.99, GPU, AMD, "https://i.imgur.com/nl0qTKC.png", rx590i);
        Product rx480 = new Product("Radeon RX 480", "We’ve re-imagined everything a gaming card can and should be and made it even more accessible than ever. You can play the latest eSports titles, the most popular AAA games, and experience the next level of immersion with exceptional VR.",
        10, 89.99, GPU, AMD, "https://i.imgur.com/8TaNgV3.png", rx480i);

        Product geforcertx2080 = new Product("GeForce RTX 2080", "GeForce RTX™ graphics cards are powered by the Turing GPU architecture and the all-new RTX platform. This gives you up to 6X the performance of previous-generation graphics cards and brings the power of real-time ray tracing and AI to games.", 10, 749.99, GPU, Intel, "https://i.imgur.com/1RqLEZ9.png",geforcertx2080i);

        Product ripjawsV2x4 = new Product("Ripjaws V Series 8GB", "(2 x 4GB) 288-Pin DDR4 SDRAM DDR4 3200 (PC4 25600)", 10, 79.99, Memory, GSkill, "https://i.imgur.com/vQ44m2X.jpg", ripjawsV2x4i);
        Product VengeanceLPX2x8 = new Product("Vengeance LPX 16GB", "(2 x 8GB) 288-Pin DDR4 SDRAM DDR4 3000 (PC4 24000) ", 10, 129.99, Memory, Corsair, "https://i.imgur.com/2q0kdvM.jpg", VengeanceLPX2x8i);
        Product VengeanceRGBPro4x8 = new Product("Vengeance RGB Pro 32GB", "(4 x 8GB) 288-Pin DDR4 DRAM DDR4 3000 (PC4 24000)", 10, 299.99, Memory, Corsair, "https://i.imgur.com/Zv3rugZ.jpg", VengeanceRGBPro4x8i);

        productRepo.deleteAll();
        List<Product> products = Arrays.asList(ryzen3, ryzen5, ryzen7, i3, i5, i7, rxvega, rx590, rx480, geforcertx2080, ripjawsV2x4, VengeanceLPX2x8, VengeanceRGBPro4x8);
        productRepo.saveAll(products);
    }

}