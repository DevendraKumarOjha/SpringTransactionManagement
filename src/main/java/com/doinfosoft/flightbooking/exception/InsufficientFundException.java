package com.doinfosoft.flightbooking.exception;

public class InsufficientFundException extends RuntimeException{
    String message;
    public InsufficientFundException(String message){
        super(message);
    }
}
