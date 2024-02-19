package com.doinfosoft.flightbooking.dto;

import com.doinfosoft.flightbooking.entity.PassengerInfo;
import com.doinfosoft.flightbooking.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {
    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;
}
