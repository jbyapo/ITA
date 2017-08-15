package com.oocl.ita.yapo.day3.exercise1and2;

public class Cycle {

	public void ride() {
		System.out.println("Ride");
	}
	
	public Cycle() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String arg[]) {
		Unicycle uni = new Unicycle();
		Bicycle bi = new Bicycle();
		Tricycle tri = new Tricycle();
		
		Cycle uniCycle = (Cycle) uni;
		Cycle biCycle = (Cycle) bi;
		Cycle triCycle = (Cycle) tri;
		
		uniCycle.ride();
		biCycle.ride();
		tri.ride();
		
		Cycle[] cycleList = new Cycle[3];
		cycleList[0] = uniCycle;
		cycleList[1] = biCycle;
		cycleList[2] = tri;
		
//		for(Cycle typeCycle : cycleList) {
//			typeCycle.balance();
//		}
		
		Unicycle uniCycle2 = (Unicycle) uniCycle;
		Bicycle biCycle2 = (Bicycle) biCycle;
		Tricycle triCycle2 = (Tricycle) triCycle;
	
		uniCycle2.balance();
		biCycle2.balance();
//		triCycle2.balance();
		
	}

}
