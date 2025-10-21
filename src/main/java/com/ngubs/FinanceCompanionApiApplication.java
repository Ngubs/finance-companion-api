package com.ngubs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"com.ngubs.controllers", "com.ngubs.services"} )
@EntityScan("com.ngubs.models")
public class FinanceCompanionApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinanceCompanionApiApplication.class, args);
    }

}
