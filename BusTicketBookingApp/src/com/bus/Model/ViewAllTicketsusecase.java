package com.bus.Model;

import com.bus.dao.AdminDao;
import com.bus.dao.AdminDaoImpl;

public class ViewAllTicketsusecase {

public static void viewAllTicket() {
		
		AdminDao dao = new AdminDaoImpl();
		dao.viewAllTickets();
	}
}
