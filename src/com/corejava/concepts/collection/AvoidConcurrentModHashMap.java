package com.corejava.concepts.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AvoidConcurrentModHashMap {
	public static void main(String[] args) {

		Map<String, String> myMap = new ConcurrentHashMap<>();
		myMap.put("1", "1");
		myMap.put("2", "2");
		myMap.put("3", "3");

		Iterator<String> it1 = myMap.keySet().iterator();
		while (it1.hasNext()) {
			String key = it1.next();
			System.out.println("Map Value:" + myMap.get(key));
			if (key.equals("1")) {
				myMap.remove("4");
				myMap.put("4", "4");
				myMap.put("5", "5");
			}
		}

		System.out.println("Map Size:" + myMap.size());
	}
}

/**So if you are using ConcurrentHashMap then avoid adding new objects as it can be processed depending on the keyset.
 * Note that the same program can print different values in your system because HashMap keyset is not ordered.
 * */
