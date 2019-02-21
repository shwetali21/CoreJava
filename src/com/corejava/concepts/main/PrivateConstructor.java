package com.corejava.concepts.main;

/**Private constructors are used to restrict the instantiation of a class.
 * When a class needs to prevent other classes from creating it’s objects then private constructors are suitable for that.
 * Objects to the class which has only private constructors can be created within the class.
 * A very good use of private constructor is in singleton pattern. This ensures only one instance of a class exist at any point of time.
 * Here is an example of singleton pattern using private constructor.
 * */
public class PrivateConstructor {
	private static PrivateConstructor object = null;

	private PrivateConstructor() {
		//private constructor
	}

	public PrivateConstructor getObject() {
		if(object == null) {
			object = new PrivateConstructor();   //Creating object using private constructor
		}

		return object;
	}
}
