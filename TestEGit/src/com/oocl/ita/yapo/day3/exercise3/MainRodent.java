package com.oocl.ita.yapo.day3.exercise3;

import java.util.ArrayList;
import java.util.List;

public class MainRodent {

//	private static List<Rodent> rodentList = new ArrayList<Rodent>();
	
	public MainRodent() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rodent[] rodents = new Rodent[3];
		rodents[0] = new Mouse();
		rodents[1] = new Gerbil();
		rodents[2] = new Hamster();
		
//		Mouse mouse = new Mouse();
//		Gerbil gerbil = new Gerbil();
//		Hamster hamster = new Hamster();
//
//		rodentList.add(mouse);
//		rodentList.add(gerbil);
//		rodentList.add(hamster);
		
		for(Rodent  rodent : rodents) {
			rodent.eats();
		}
		

	}

}
