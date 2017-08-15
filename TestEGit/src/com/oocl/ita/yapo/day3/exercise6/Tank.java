package com.oocl.ita.yapo.day3.exercise6;

public class Tank {

	public static String state = "";
	
	public Tank() {
		// TODO Auto-generated constructor stub
	}
	
	public void fillTheTank(Tank tank) {
		System.out.println("Fill: The tank has been filled up!");
		state = "Filled";
	}
	
	public void emptyTheTank(Tank tank) { 
		System.out.println("Empty: The tank has been emptied!");
		state = "Emptied";
	}
	
	public void finalize() {
		if (state.equalsIgnoreCase("Filled")) {
			System.out.println("Object: Tank is not empty!");
		} else {
			System.out.println("Object: Tank is empty!");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank = new Tank();
		
		tank.fillTheTank(tank);
		tank.emptyTheTank(tank);
		
		System.gc();
		
	}

}
