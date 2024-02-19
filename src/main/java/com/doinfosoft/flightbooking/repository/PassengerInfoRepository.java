package com.doinfosoft.flightbooking.repository;

import com.doinfosoft.flightbooking.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {
}
