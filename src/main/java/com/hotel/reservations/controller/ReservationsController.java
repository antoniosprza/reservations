package com.hotel.reservations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.reservations.model.Reservations;
import com.hotel.reservations.repository.ReservationsRepository;

@RestController
public class ReservationsController {
	
	@Autowired
	private ReservationsRepository respository;
	
	@GetMapping("reservations")
	public List<Reservations> getAll(){
		return this.respository.findAll();
	}

}
