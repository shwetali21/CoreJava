package com.corejava.concepts.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentExceptionForHashMap {

	public static void main(String[] args) {

		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("1", "1");
		myMap.put("2", "2");
		myMap.put("3", "3");

		Iterator<String> it1 = myMap.keySet().iterator();
		while (it1.hasNext()) {
			String key = it1.next();
			System.out.println("Map Value:" + myMap.get(key));
			if (key.equals("2")) {
				myMap.put("1", "4");
				//myMap.put("4", "4");
			}
		}
	}
}
/**Since we are updating the existing key value in the myMap, its size has not been changed and we are not getting ConcurrentModificationException.
 * Note that the output may differ in your system because HashMap keyset is not ordered like list.
 * If you will uncomment the statement a new key-value is being added in the HashMap, it will cause ConcurrentModificationException.
 */