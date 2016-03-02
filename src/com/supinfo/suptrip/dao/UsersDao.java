package com.supinfo.suptrip.dao;

import com.supinfo.suptrip.models.Trip;
import com.supinfo.suptrip.models.Users;

public interface UsersDao {
	
	void addUser(Users user);
	void removeUser(Users user);
	void updateUser(Users user);
	void addTripInBag (Users user,Trip trip );
	void removeTripInbag(Users user, Trip trip);
	Users getUserById(Long id) ;
	Users findByCampusBooster(String idbooster);
	boolean login(String idbooster, String password);
}
