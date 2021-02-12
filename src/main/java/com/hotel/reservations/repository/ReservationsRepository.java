package com.hotel.reservations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.reservations.model.Reservations;

@Repository
public interface ReservationsRepository extends JpaRepository<Reservations, Long>{

}
