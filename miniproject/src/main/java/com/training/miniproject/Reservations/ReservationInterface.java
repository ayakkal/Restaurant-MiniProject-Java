package com.training.miniproject.Reservations;

import java.time.LocalDate;

public interface ReservationInterface {

	public void removeReservation(String name);
	public void editReservation(String name, LocalDate date);
	public void addReservation(String name, LocalDate date);
	
}
