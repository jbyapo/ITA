package com.oocl.ita.yapo.day13.sampleexercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Employee emp = (Employee) context.getBean("employee");
		emp.getEmployeeInfo();

	}

}
