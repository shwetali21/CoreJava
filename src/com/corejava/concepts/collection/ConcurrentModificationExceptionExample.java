package com.corejava.concepts.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionExample {
	public static void main(String[] args) {

		List<String> numList = new ArrayList<>();

		numList.add("1");
		numList.add("2");
		numList.add("3");
		numList.add("4");
		numList.add("5");

		Iterator<String> itr = numList.iterator();
		String value = itr.next();
		while(null != value) {
			System.out.println("List Value: " + value);
			//if(value.equals("3"))
				//numList.remove(value);
			value = itr.next();
		}
	}
}

/**Above program will throw java.util.ConcurrentModificationException when executed, as shown in below console logs.*/

/**From the output stack trace, its clear that the concurrent modification exception is coming when we call iterator next() function.
 * If you are wondering how Iterator checks for the modification, its implementation is present in AbstractList class 
 * where an int variable modCount is defined. modCount provides the number of times list size has been changed.
 * modCount value is used in every next() call to check for any modifications in a function checkForComodification().
 * */
