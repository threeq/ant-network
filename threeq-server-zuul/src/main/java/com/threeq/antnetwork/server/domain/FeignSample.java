package com.threeq.antnetwork.server.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Date 2017/4/22
 * @User three
 */
//@Component
public class FeignSample implements CommandLineRunner {

    @Autowired
    private RestaurantClient restaurantClient;

    @Override
    public void run(String... strings) throws Exception {
        this.restaurantClient.getRestaurants("o").forEach((String restaurant) -> {
            System.out.println("\n\n\n[ " + restaurant + "]");
        });
    }
}
