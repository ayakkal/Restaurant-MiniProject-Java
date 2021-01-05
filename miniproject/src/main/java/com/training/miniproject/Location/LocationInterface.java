package com.training.miniproject.Location;

public interface LocationInterface {

	public void addLocationObj(LocationClass locationObj);
	public void removeLocation(Double longitude, Double latitude);
	public void updateLocation(Double longitude, Double latitude, String phno);
	public void searchNearest(Double longitude,Double latitude)
;	
}
