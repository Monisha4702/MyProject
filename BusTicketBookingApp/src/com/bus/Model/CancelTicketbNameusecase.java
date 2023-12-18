package com.bus.Model;

import java.util.Scanner;

import com.bus.UserDefinedExceptions.BusException;
import com.bus.beanClasses.Customer;
import com.bus.dao.CustomerDao;
import com.bus.dao.CustomerDaoImpl;

public class CancelTicketbNameusecase {
	
	public  static void cancelTicket(Customer customer) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println( "Enter Bus Name" );
		String bName = sc.nextLine();
		
		CustomerDao dao = new CustomerDaoImpl();
		try {
			
			int cusId = customer.getCusId();
			String message = dao.cancelTicket(bName, cusId);
			
			if (message.equals("Ticket cancelled Successfully")) {
				System.out.println( message );
			}
			else {
				System.out.println( message );
			}
			
		} catch (BusException e) {
			System.out.println( e.getMessage() );
		}
	
	}
}
