package com.corejava.concepts.classes;

public class ImmutableExample {
	public static void main(String[] args) {
		
		ImmutableEmployee imEmp = new ImmutableEmployee("Shwetali", 101);
		
		System.out.println(imEmp.getId() + " - " + imEmp.getName());
	}
}
