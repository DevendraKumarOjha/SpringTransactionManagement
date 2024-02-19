package com.doinfosoft.flightbooking.controller;

import com.doinfosoft.flightbooking.dto.FlightBookingAcknowledgement;
import com.doinfosoft.flightbooking.dto.FlightBookingRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightBookingController {
    @Autowired
    FlightBookingService flightBookingService;

    @PostMapping("/bookmyflight")
    public FlightBookingAcknowledgement flightBookingApplication(@RequestBody FlightBookingRequest request) {
        return flightBookingService.bookAFlight(request);

    }
}
