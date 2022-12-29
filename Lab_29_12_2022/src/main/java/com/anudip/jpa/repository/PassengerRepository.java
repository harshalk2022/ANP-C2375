package com.anudip.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anudip.jpa.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

	// Cousutomized query using jpql
	
	@Query("select p from Passenger p Where p.pName=?1")
	Passenger getPassengerByName(String pName);
	
	@Query("select p from Passenger p Where phone=?1")
	Passenger getPassengerByPhone(long phone);
	
}
