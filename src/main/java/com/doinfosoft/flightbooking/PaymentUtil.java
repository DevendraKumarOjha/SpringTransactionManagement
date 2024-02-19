package com.doinfosoft.flightbooking;

import com.doinfosoft.flightbooking.exception.InsufficientFundException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtil {

    private static Map<String, Double> paymentMap = new HashMap<>();

    static{
        paymentMap.put("acc1",10000.0);
        paymentMap.put("acc2",18000.0);
        paymentMap.put("acc3",8000.0);
        paymentMap.put("acc4",5000.0);
    }

    public static boolean validateCreditLimit(String accNo, double amount){
        if(amount > paymentMap.get(accNo)){
        throw new InsufficientFundException("You have Insufficient fund in your account");
        }else {
            return true;
        }
    }
}
