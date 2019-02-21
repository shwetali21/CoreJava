package com.corejava.concepts.references;

public class StrongReferenceExample {

	public static void main(String[] args) {
		ReferenceA a = new ReferenceA();      //Strong Reference
		
		a = null;    //Now, object to which 'a' is pointing earlier is eligible for garbage collection.
	}
}
