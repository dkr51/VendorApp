 package com.app.dao;

import java.util.List;

import com.app.model.Location;


public interface ILocationDao {
	
	public int saveLocation(Location loc);
	public void updateLocation(Location loc);
	public void deleteLocById(int locId);
	public Location getLocationById(int locId);
	public List<Location> getAllLocations();
	
}
