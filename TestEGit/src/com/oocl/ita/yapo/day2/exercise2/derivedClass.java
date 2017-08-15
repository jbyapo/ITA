package com.oocl.ita.yapo.day2.exercise2;

public class derivedClass extends baseClass {

	public void secondMethod() {
		System.out.println("I'm from derived class!");
	}

	public static void main(String[] args) {
		derivedClass derivedClass = new derivedClass();
		baseClass baseDerived = (baseClass) derivedClass;
		baseDerived.firstMethod();
	}

}
