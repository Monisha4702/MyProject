package com.bus.UserDefinedExceptions;

public class BusException extends Exception{

	public BusException() {
		
	}
	
	public BusException(String str) {
		super (str);
	}
}
