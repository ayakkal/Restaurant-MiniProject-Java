package com.training.miniproject.Location;

public class LocationClass{
	
	private double longitude;
	private double latitude;
	private String address;
	private String phno;
	
	
	public LocationClass(double longitude, double latitude, String address, String phno) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.address = address;
		this.phno = phno;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}
	
	
}
