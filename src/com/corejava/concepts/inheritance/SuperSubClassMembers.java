package com.corejava.concepts.inheritance;

class SuperClassA {
	
	int i = 10;
}

class SubClassB extends SuperClassA {
	int i = 20;
	
}

public class SuperSubClassMembers {
	public static void main(String[] args) {
		
		SuperClassA a = new SubClassB();
		System.out.println(a.i);
		
		SubClassB b = new SubClassB();
		System.out.println(b.i);
	}
}
