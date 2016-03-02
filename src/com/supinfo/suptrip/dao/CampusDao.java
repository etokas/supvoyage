package com.supinfo.suptrip.dao;

import java.util.List;

import com.supinfo.suptrip.models.Campus;

public interface CampusDao {
	void addCampus(Campus campus);
	void removeCampus(Campus campus);
	List<Campus> getAllCampus();
	Campus getCampusById(Long id);

}
