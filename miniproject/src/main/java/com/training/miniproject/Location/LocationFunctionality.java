package com.training.miniproject.Location;

import java.util.Scanner;

public class LocationFunctionality {
	
	Scanner sc =  new Scanner(System.in);
	InitializerClass initializer;
	
	public LocationFunctionality() {
		this.initializer = new InitializerClass();
	}

	public void addLocation() {
		
		System.out.println("Enter the Longitude: ");
		Double longitude = sc.nextDouble();
		System.out.println("Enter the Latitude: ");
		Double latitude = sc.nextDouble();
		System.out.println("Enter the full address: ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println("Enter the Phone number: ");
		String phno = sc.nextLine();
		
		LocationClass location = new LocationClass(longitude,latitude,address.trim(),phno.trim());
		this.initializer.addLocationObj(location);
		
		System.out.println("Successfully added the Location ");
		
	}
	
	public void updateLocation() {
		
		System.out.println("Enter the Longitude for searching: ");
		Double longitude = sc.nextDouble();
		System.out.println("Enter the Latitude for searching: ");
		Double latitude = sc.nextDouble();
		System.out.println("Enter the phno to be updated: ");
		sc.nextLine();
		String phno = sc.nextLine().trim();
	
		this.initializer.updateLocation(longitude,latitude,phno);
		
		System.out.println("Successfully updated the phone number");
	}
	
	public void removeLocation() {
		System.out.println("Enter the Longitude of the location that needs to be deleted: ");
		Double longitude = sc.nextDouble();
		System.out.println("Enter the Latitude of the location that needs to be deleted: ");
		Double latitude = sc.nextDouble();
		
		this.initializer.removeLocation(longitude, latitude);
		
		System.out.println("Successfully removed the Location ");
	}
	
	public void showAllLocations() {
		System.out.println(" This is the list of all the locations of our store :");
		
		for(LocationClass loc : this.initializer.getLocationObjs()) {
			
			System.out.println(" 1. Longitude "+ loc.getLongitude() +" , Latitude " + loc.getLatitude() +" , Address : "
			+ loc.getAddress()+ " , Phno : " + loc.getPhno());
		
		}
	
	}
	
	public void searchNearestStore() {
		
		System.out.println("Enter your Longitudinal location : ");
		Double longitude = sc.nextDouble();
		System.out.println("Enter the Latitudinal location : ");
		Double latitude = sc.nextDouble();
		
		this.initializer.searchNearest(longitude, latitude);
		
	}

}
