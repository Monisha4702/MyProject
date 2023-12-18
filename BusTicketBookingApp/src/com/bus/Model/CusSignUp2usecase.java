package com.bus.Model;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bus.beanClasses.Customer;
import com.bus.dao.CustomerDao;
import com.bus.dao.CustomerDaoImpl;

public class CusSignUp2usecase {

	public static boolean cusSignUp() {
		
		boolean flag = false;
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Username" );
			String username = sc.next();
			
			System.out.println("Enter Password" );
			String password = sc.next();
			
			System.out.println("Enter First Name" );
			String firstName = sc.next();
			
			System.out.println( "Enter Last Name");
			String lastName = sc.next();
			
			sc.nextLine();
			System.out.println( "Enter Address" );
			String address = sc.nextLine();
			
			System.out.println( "Enter Mobile" );
			String mobile = sc.next();
			
			CustomerDao dao = new CustomerDaoImpl();
			Customer customer = new Customer(username, password, firstName, lastName, address, mobile);
			
			String result = dao.cusSignUp(customer);
			
			
			if (result == "Sign up Successfull") {
				flag = true;
				System.out.println( result );
			}
			else {
				System.out.println( result );
			}
			
		}
		catch (InputMismatchException e) {
			System.out.println( "Invalid Input" );
		}
		
		return flag;
	}

}
