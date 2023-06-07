package com.example.beverageseller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BeverageSellerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeverageSellerApplication.class, args);
    }

}
