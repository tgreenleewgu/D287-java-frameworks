package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if(partRepository.count()==0) {


            InhousePart driver = new InhousePart();
            driver.setName("Driver");
            driver.setPrice(450.0);
            driver.setInv(10);
            driver.setMinInventory(0);
            driver.setMaxInventory(50);
            driver.setPartId(1); // Assuming partId is an identifier specific to InhousePart
            partRepository.save(driver);

            InhousePart drivingIron = new InhousePart();
            drivingIron.setName("Driving Iron");
            drivingIron.setPrice(215.0);
            drivingIron.setInv(6);
            drivingIron.setMinInventory(0);
            drivingIron.setMaxInventory(50);
            drivingIron.setPartId(2); // Assuming partId is an identifier specific to InhousePart
            partRepository.save(drivingIron);

            InhousePart irons = new InhousePart();
            irons.setName("Irons");
            irons.setPrice(1200.0);
            irons.setInv(16);
            irons.setMinInventory(0);
            irons.setMaxInventory(50);
            irons.setPartId(3); // Assuming partId is an identifier specific to InhousePart
            partRepository.save(irons);

            InhousePart wedges = new InhousePart();
            wedges.setName("Wedges");
            wedges.setPrice(300.0);
            wedges.setInv(15);
            wedges.setMinInventory(0);
            wedges.setMaxInventory(50);
            wedges.setPartId(4); // Assuming partId is an identifier specific to InhousePart
            partRepository.save(wedges);


            InhousePart putter = new InhousePart();
            putter.setName("Putter");
            putter.setPrice(175.0);
            putter.setInv(12);
            putter.setMinInventory(0);
            putter.setMaxInventory(50);
            putter.setPartId(5); // Assuming partId is an identifier specific to InhousePart
            partRepository.save(putter);
        }



        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        if(productRepository.count()==0) {
            ;

            Product fullSet = new Product();
            fullSet.setName("Full Set");
            fullSet.setPrice(3000.0);
            fullSet.setInv(12);
            fullSet.setId(6);
            productRepository.save(fullSet);

            Product midRange = new Product();
            midRange.setName("Mid Range Set");
            midRange.setPrice(1500.0);
            midRange.setInv(3);
            midRange.setId(7);
            productRepository.save(midRange);

            Product drivingSet = new Product();
            drivingSet.setName("Driving Set");
            drivingSet.setPrice(670.0);
            drivingSet.setInv(3);
            drivingSet.setId(8);
            productRepository.save(drivingSet);

            Product shortSet = new Product();
            shortSet.setName("Short Game Set");
            shortSet.setPrice(480.0);
            shortSet.setInv(5);
            shortSet.setId(9);
            productRepository.save(shortSet);

            Product ironsOnly = new Product();
            ironsOnly.setName("Irons Only Set");
            ironsOnly.setPrice(1400.0);
            ironsOnly.setInv(12);
            ironsOnly.setId(10);
            productRepository.save(ironsOnly);
        }



        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
