package com.training.miniproject.Reservations;

import java.time.LocalDate;

public class Reservation {
	
	private String name;
	private LocalDate date;
	
	public Reservation(String name, LocalDate date) {
		super();
		this.name = name;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	

}
