package com.smartdiscover.controller;

import com.smartdiscover.entity.Price;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class PriceController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PriceController.class);

    private static HashMap<Long, Price> priceMap = new HashMap<>();

    static {
        Price p1 = new Price();
        p1.setProductId(100);
        p1.setPriceAmount(200);
        p1.setDiscount(10);

        priceMap.put(p1.getProductId(), p1);

        Price p2 = new Price();
        p2.setProductId(200);
        p2.setPriceAmount(500);
        p2.setDiscount(5);

        priceMap.put(p2.getProductId(), p2);

    }

    @GetMapping(path = "/price/{id}")
    public Price getPrice(@PathVariable("id") long productId) {
        LOGGER.info("Getting Price details for Product Id {}", productId);
        return priceMap.get(productId);
    }

}
