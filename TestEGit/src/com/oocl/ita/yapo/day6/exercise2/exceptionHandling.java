package com.oocl.ita.yapo.day6.exercise2;

public class exceptionHandling {

	public exceptionHandling() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nullable = null;
		
		try {
			nullable.length();
		} catch (NullPointerException e) {
			System.out.println("Output: \nCaught exception " + e);
		}
		
	}

}
