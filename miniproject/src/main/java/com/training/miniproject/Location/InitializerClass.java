package com.training.miniproject.Location;

import java.util.ArrayList;

public class InitializerClass implements LocationInterface {

	ArrayList<LocationClass> locationObjs = new ArrayList<LocationClass>();

	public InitializerClass() {
		
		locationObjs.add(new LocationClass(89.98,65.87,"205 Barton Creek Dr, 28243, NC", "9701227743"));
		locationObjs.add(new LocationClass(29.84,15.87,"1000 Ardrey Crest Dr, 28244, NC", "9701227744"));
		locationObjs.add(new LocationClass(47.38,95.72,"980 Ballantyine Dr, 28245, NC", "9701227745"));
		locationObjs.add(new LocationClass(39.18,25.17,"05 Shanon Green Dr, 28246, NC", "9701227746"));
		locationObjs.add(new LocationClass(59.888,66.667,"505 Param Veer Dr, 28247, NC", "9701227747"));
	}
	
	public ArrayList<LocationClass> getLocationObjs() {
		return locationObjs;
	}
	
	public void addLocationObj(LocationClass locationObj) {
		
		locationObjs.add(locationObj);
		
	}
	
	public void removeLocation(Double longitude, Double latitude) {
		
		for(LocationClass loc: locationObjs) {
			
			if(longitude == loc.getLongitude() && latitude == loc.getLongitude()) {
				locationObjs.remove(loc);
				break;
			}
			
		}
		
	}
	
	public void updateLocation(Double longitude, Double latitude, String phno) {
		
		for(LocationClass loc : locationObjs) {
			
			if(longitude == loc.getLongitude() && latitude == loc.getLongitude()) {
				loc.setPhno(phno);
				break;
			}	
		}
	}

	@Override
	public void searchNearest(Double longitude, Double latitude) {
		
		Double nearest = Double.MAX_VALUE;
		LocationClass loc = null;
		if(locationObjs.size()==0) {
			System.out.println(" No nearest Locations");
		}
		for(LocationClass location: locationObjs) {
			Double temp = distance(location.getLatitude(),location.getLongitude(),latitude,longitude);
			if(temp<=nearest) {
				nearest =temp;
				loc = location;
			}
			
		}
		
		System.out.println("Nearest location to the user is having at : Longitude = " + loc.getLongitude() 
		+ ", Latitude = " + loc.getLatitude() +", Address = "+ loc.getAddress() + ", Phno = "+ loc.getPhno());
		
		
		
	}
	
	private double distance(double lat1, double lon1, double lat2, double lon2) {
        
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2))
                + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2))
                * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60;
        dist = dist * 1852;
        return (dist);
    }

    private double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    private double rad2deg(double rad) {
        return (rad * 180.0 / Math.PI);
    }
	
	
	
	
	
	

}
