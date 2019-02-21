package com.corejava.concepts.encapsulation;

class A {
	public void methodOfA() {
		System.out.println("Class A");
	}
}

class B extends A {

	//Cannot reduce the visibility while overriding a method
	//@Override
	/*void methodOfA() {	//Compile-time Error: Cannot reduce the visibility of the inherited method from A.
		System.out.println("Class B");
	}*/
}

public class TestProgram1 {

}
