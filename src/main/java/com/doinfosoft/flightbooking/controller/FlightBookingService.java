package com.doinfosoft.flightbooking.controller;

import com.doinfosoft.flightbooking.PaymentUtil;
import com.doinfosoft.flightbooking.dto.FlightBookingAcknowledgement;
import com.doinfosoft.flightbooking.dto.FlightBookingRequest;
import com.doinfosoft.flightbooking.entity.PassengerInfo;
import com.doinfosoft.flightbooking.entity.PaymentInfo;
import com.doinfosoft.flightbooking.repository.PassengerInfoRepository;
import com.doinfosoft.flightbooking.repository.PayementInfoRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class FlightBookingService {
    @Autowired
    PassengerInfoRepository passengerInfoRepository;
    @Autowired
    PayementInfoRepositoty payementInfoRepositoty;
    @Transactional
    public FlightBookingAcknowledgement bookAFlight(FlightBookingRequest request) {
        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();

        PaymentUtil.validateCreditLimit(paymentInfo.getAccountNo(),passengerInfo.getFare());

        paymentInfo.setPassengerId(passengerInfo.getId());
        paymentInfo.setAmount(passengerInfo.getFare());
        payementInfoRepositoty.save(paymentInfo);

        return new FlightBookingAcknowledgement("Success",passengerInfo.getFare(), UUID.randomUUID().toString(),passengerInfo);

    }


}
