package com.corejava.concepts.inheritance;

/**Constructors, SIB – Static Initialization Block and IIB – Instance Initialization Block of super class will not be inheriting to its sub class.
 * But they are executed while creating an object to sub class.
 * */
class A {
	int i;

	static {
		System.out.println("Class A SIB");
	}

	{
		System.out.println("Class A IIB");
	}

	A() {
		System.out.println("Class A Constructor");
	}
}

class B extends A {
	int j;
}

public class SICWithInheritance {
	public static void main(String[] args) {

		B b = new B();
		System.out.println(b.toString());
	}
}

/**Order of Execution:
 * Static Initialization Block
 * Instance Initialization Block
 * Constructor
 * */
