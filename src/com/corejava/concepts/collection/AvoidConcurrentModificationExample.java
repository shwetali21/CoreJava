package com.corejava.concepts.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class AvoidConcurrentModificationExample {
	public static void main(String[] args) {

		List<String> myList = new CopyOnWriteArrayList<>();	
		//In case of CopyOnWriteArrayList, iterator doesn’t accommodate the changes in the list and works on the original list.

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");

		Iterator<String> it = myList.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println("List Value:" + value);
			//if (value.equals("3")) {
				myList.remove("4");
			/*
			 * myList.add("6"); myList.add("7");
			 */
			//}
		}

		System.out.println("List Size:" + myList.toString());
		
		
		List<Integer> newList = new ArrayList<>();
		newList.add(1);
		newList.add(2);
		newList.add(3);
		
		List<Integer> newList1 = newList.stream().filter(x -> x<3).collect(Collectors.toList());
		System.out.println(newList1.toString());
	}
}
