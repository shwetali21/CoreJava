package com.corejava.concepts.inheritance;


abstract class AbstractA {
	
	int a = 10;
	
	void printAll() {
		
	}
	
	AbstractA() {
		
	}
}

interface IA {
	
	int i =20;	//by deafult static
	
}

public class AbstractDemo extends AbstractA implements IA{
	
	public static void main(String[] args) {
		System.out.println(IA.i);
		
		System.out.println(new AbstractDemo().a);
	}


}
