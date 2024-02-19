package com.doinfosoft.flightbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class FlightbookingApplication {


    public static void main(String[] args) {
        SpringApplication.run(FlightbookingApplication.class, args);
    }

}
