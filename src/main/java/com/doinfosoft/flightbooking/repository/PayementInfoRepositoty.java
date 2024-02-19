package com.doinfosoft.flightbooking.repository;

import com.doinfosoft.flightbooking.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayementInfoRepositoty extends JpaRepository<PaymentInfo,String> {
}
