package com.bus.dao;

import com.bus.beanClasses.Bus;

public interface AdminDao {
	
	public final String username = "team";
	
	public final String password = "team";

	public String adminLogin(String username, String password);

	public String addBus(int busNo, String bName, String routeFrom, String routeTo, String bType, String arrival, String departure,
			int totalSeats, int availSeats, int fare);
	
	public String addBus(Bus bus);
	
	public String updateStatus(int cusId);
	
	public void viewAllTickets();
}
