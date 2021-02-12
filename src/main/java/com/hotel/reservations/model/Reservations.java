package com.hotel.reservations.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reservations")
public class Reservations {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private Timestamp localDateTime;

	public Reservations() {
		super();
	}

	public Reservations(String name, java.sql.Timestamp timestamp) {
		this.name = name;
		this.localDateTime = timestamp;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(Timestamp localDateTime) {
		this.localDateTime = localDateTime;
	}
	
	

}
