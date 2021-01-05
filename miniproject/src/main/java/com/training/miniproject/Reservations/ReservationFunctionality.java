package com.training.miniproject.Reservations;

import java.time.LocalDate;
import java.util.Scanner;

public class ReservationFunctionality {
	
	Scanner sc =  new Scanner(System.in);
	ReservationInitializer resIntitializer;
	public ReservationFunctionality() {
		this.resIntitializer = new ReservationInitializer();
	}
	
	
	public void addReservation() {
		
		System.out.println("Enter customers name: ");
		String name = sc.nextLine();
		System.out.println("Enter the Date in (yyyy/mm/dd) format : ");
		String date = sc.nextLine();
		
		if(date.split("/").length != 3) {
			
			System.out.println(" Please enter all the date fields ");	
		}
		else {
			int year = Integer.parseInt(date.split("/")[0]);
			int month = Integer.parseInt(date.split("/")[1]);
			int day = Integer.parseInt(date.split("/")[2]);
			this.resIntitializer.addReservation(name,LocalDate.of(year, month, day));
		}
			
	}
	
	public void showReservations() {
		
		System.out.println("The list of reservations is :  ");
		for(Reservation res: resIntitializer.getResList()) {
			
			System.out.println(" *  Name : "+ res.getName() +" , Date : " + res.getDate());
		
		}
			
	}
	
	public void editReservations() {
		
		System.out.println("Enter customers name: ");
		String name = sc.nextLine();
		System.out.println("Enter the Date in (yyyy/mm/dd) format : ");
		String date = sc.nextLine();
		
		if(date.split("/").length != 3) {
			
			System.out.println(" Please enter all the date fields ");
			
		}
		else {
			int year = Integer.parseInt(date.split("/")[0]);
			int month = Integer.parseInt(date.split("/")[1]);
			int day = Integer.parseInt(date.split("/")[2]);
			this.resIntitializer.editReservation(name,LocalDate.of(year, month, day));
			System.out.println("Successfully edited the Reservation ");
		}
		
		
		
	}
	
	public void removeReservation() {
		
		System.out.println("Enter customers name: ");
		String name = sc.nextLine();
		
		this.resIntitializer.removeReservation(name);
		
	}
	
	
	

}
