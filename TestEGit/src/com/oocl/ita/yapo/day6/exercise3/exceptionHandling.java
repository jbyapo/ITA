package com.oocl.ita.yapo.day6.exercise3;

public class exceptionHandling  {

	public exceptionHandling() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nullable = null;
		
		try {
			throw new AnException(nullable); 
		} catch (AnException e) {
			System.err.println("Caught exception " + e);
		}
		
		try {
			throw new SomeException(nullable); 
		} catch (SomeException e) {
			System.err.println("Caught exception " + e);
		}
		
		try {
			throw new OtherException(nullable); 
		} catch (OtherException e) {
			System.err.println("Caught exception " + e);
		}
		
	}

}
