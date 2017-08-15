package com.oocl.ita.yapo.day3.exercise4;

public class fibonacciSeries {

	
	
	public fibonacciSeries() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long length = 100;
		long number1 = 0;
		long number2 = 1;
		long tempNumber = 0;
		
		for (int i=1;i<=length;i++) {
			tempNumber = number1 + number2;
			number1 = number2;
			number2 = tempNumber;
			if(number1 > 100) {
				length = 0;
			} else {
				System.out.print(number1 + " ");
			}
			System.out.print(number1 + " ");
		}
	}

}
