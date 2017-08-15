package com.oocl.ita.yapo.day3.exercise5;

public class Dog {

	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public void bark (int version) {
		System.out.println("Arf!");
	}
	
	public void bark (long version) {
		System.out.println("Awo!");
	}
	
	public void bark (double version) {
		System.out.println("Aroof!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog doggo = new Dog();
		
		doggo.bark(1);
		doggo.bark(1.0);
		doggo.bark(-1234678910L);

	}

}
