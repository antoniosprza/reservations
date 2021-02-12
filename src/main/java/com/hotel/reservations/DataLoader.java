package com.hotel.reservations;

import java.sql.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hotel.reservations.model.Reservations;
import com.hotel.reservations.repository.ReservationsRepository;

@Component
public class DataLoader implements CommandLineRunner{
	
	@Autowired
	private ReservationsRepository repository;
	
	@Override
    public void run(String... args) throws Exception {
		String chain = "Reservation No. ";
		for(int i = 1 ; i <= 100 ; i ++) {
			chain += String.valueOf(i);
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			repository.save(new Reservations(chain, timestamp ));
			chain = "Reservation No. ";
		}
	}
}
