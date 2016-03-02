package com.supinfo.suptrip.dao;

import java.util.List;

import com.supinfo.suptrip.models.Trip;

public interface TripDao {
	
	void addTrip(Trip trip);	
	List<Trip> getAllTripListByCampusName();
	void removeTrip(Trip trip);
	void updateTrip(Trip trip);
	Trip findTripById(Long id);
	

}
