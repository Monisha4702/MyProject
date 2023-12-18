package com.bus.Model;

import com.bus.beanClasses.Customer;
import com.bus.dao.CustomerDao;
import com.bus.dao.CustomerDaoImpl;

public class ViewTicketusecase {

	public static void viewTicket(Customer customer) {
		
		CustomerDao dao = new CustomerDaoImpl();
		
		dao.viewTicket(customer.getCusId());
	}
}
