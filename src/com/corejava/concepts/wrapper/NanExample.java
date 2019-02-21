package com.corejava.concepts.wrapper;

public class NanExample {
	public static void main(String[] args) {

		try {
			Integer i = 0/0;

			System.out.println(i);
		} catch (Exception e) {
			System.out.println(e);
		} 
	}
}
