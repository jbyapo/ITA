package com.oocl.ita.yapo.day14.sampleexercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	@Autowired
	   @Qualifier("student1")
	   private Student1 student1;

	   public Profile(){
	      System.out.println("Inside Profile constructor." );
	   }
	   public void printAge() {
	      System.out.println("Age : " + student1.getAge() );
	   }
	   public void printName() {
	      System.out.println("Name : " + student1.getName() );
	   }

}
