package com.corejava.concepts.inheritance;

class TestClassA1 {
	int i = 10;

	void print() {
		System.out.println("Class A Method");
	}
}

class TestClassB1 extends TestClassA1 {
	int i = 20;

	void print() {
		System.out.println("Class B Method");
	}
}

public class TestProgram1 {
	public static void main(String[] args) {
		TestClassA1 a = new TestClassB1();

		System.out.println(a.i);
		a.print();
	}
}
