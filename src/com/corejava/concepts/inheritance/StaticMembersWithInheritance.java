package com.corejava.concepts.inheritance;

class A1 {
	int i;

	A1(int i) {
		System.out.println("Class A Constructor");
	}
}

class B1 extends A1 {
	int j;

	/**You will get a compile time error saying implicit default constructor A1() is undefined for Class A1. 
	 * Compiler will force you to write constructor in Class B1. Because, we are not defining constructor for Class B1.
	 * So, compiler will be providing default constructor. In that default constructor,
	 * first statement is super() – it is a calling statement to default constructor of Class A1.
	 * But it is not defined in Class A1. Therefore you will get a compile time error.
	 * To avoid this error, write the constructor for sub class. From that constructor call super class constructor explicitly. 
	 * */
	public B1() {
		super(10);     //Explicitly Calling Class A1 constructor
		System.out.println("Class B Constructor");
	}
}

public class StaticMembersWithInheritance {
	public static void main(String[] args) {

	}
}
