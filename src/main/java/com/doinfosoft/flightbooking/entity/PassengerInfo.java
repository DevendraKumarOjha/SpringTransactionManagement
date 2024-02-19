package com.doinfosoft.flightbooking.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="PASSENGER_INFO")
public class PassengerInfo {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String bookingDestination;
    private String bookingSource;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private Date bookingDate;
    private double fare;

}
