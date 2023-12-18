package com.bus.Model;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bus.UserDefinedExceptions.CustomerException;
import com.bus.beanClasses.Customer;
import com.bus.dao.CustomerDao;
import com.bus.dao.CustomerDaoImpl;

public class CusLoginusecase {

	public static Customer CusLogin() {
		
		Customer customer = null;
		
		try {
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Enter Username" );
			String username = sc.next();
			
			System.out.println("Enter Password" );
			String password = sc.next();
			
			CustomerDao dao = new CustomerDaoImpl();
			
			try {
				customer = dao.cusLogin(username, password);
				
				System.out.println( "Welcome " + customer.getFirstName() + " " + customer.getLastName() );
			} catch (CustomerException e) {
				
				System.out.println( e.getMessage() );
			}
		}
		catch (InputMismatchException e) {
			System.out.println( e.getMessage() );
		}
		
		return customer;

	}

}
