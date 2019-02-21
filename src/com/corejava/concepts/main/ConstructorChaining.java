package com.corejava.concepts.main;

/**Constructor Chaining is a technique of calling another constructor from one constructor.
 * this() is used to call same class constructor where as super() is used to call super class constructor.
 * We can’t use this() and super() in a method.
 * */
class SuperClass {
	public SuperClass(int i) {
		System.out.println("Super Class Constructor");
	}
}

class SubClass extends SuperClass {
	public SubClass() {
		this(10);      //Calling same class constructor
	}

	public SubClass(int i) {
		super(i);      //Calling super class constructor
	}
}

public class ConstructorChaining extends SubClass {
	public static void main(String[] args) {
		new SubClass();
		new SubClass(10);
	}
}
