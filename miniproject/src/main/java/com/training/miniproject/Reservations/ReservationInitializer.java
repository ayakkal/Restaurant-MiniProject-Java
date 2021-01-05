package com.training.miniproject.Reservations;

import java.time.LocalDate;
import java.util.ArrayList;

public class ReservationInitializer implements ReservationInterface {
	
	ArrayList<Reservation> resList = new ArrayList<Reservation>();

	public ReservationInitializer() {
		super();
		resList.add(new Reservation("Akhil",LocalDate.of(2020, 12, 21)));
		resList.add(new Reservation("Manik",LocalDate.of(2020, 12, 22)));
		resList.add(new Reservation("Vamshi",LocalDate.of(2020, 12, 19)));
		resList.add(new Reservation("Ujwala",LocalDate.of(2020, 12, 20)));
		resList.add(new Reservation("Mark",LocalDate.of(2020, 12, 23)));
		resList.add(new Reservation("Anu",LocalDate.of(2020, 12, 24)));
		resList.add(new Reservation("Reddy",LocalDate.of(2020, 12, 25)));
		resList.add(new Reservation("Bose",LocalDate.of(2020, 12, 26)));
		resList.add(new Reservation("Jon",LocalDate.of(2020, 12, 27)));
		
	}
	
	
	public ArrayList<Reservation> getResList() {
		return resList;
	}



	public void addReservation(String name, LocalDate date) {
		Boolean doIt = false;
		for(Reservation res: resList) {
			
			if(res.getName().equals(name) && res.getDate().equals(date)) {
				
				System.out.println("Reservation already exists ");
				break;
			}else {
				doIt = true;
			}
		}
		if(doIt) {
			this.resList.add(new Reservation(name,date));
			System.out.println("Reservation added successfuly");
		}
	}
	
	public void editReservation(String name, LocalDate date) {
		
		for(Reservation res: resList) {
			
			if(res.getName().equals(name)) {	
				res.setDate(date);
				break;
			}	
		}
	}
	
	public void removeReservation(String name) {
		
		for(Reservation res: resList) {
			
			if(res.getName().equals(name)) {	
				resList.remove(res);
				break;
			}	
		}
	}
	
	
	
	

}
