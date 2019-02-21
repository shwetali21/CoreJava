package com.corejava.concepts.references;

import java.lang.ref.SoftReference;

public class SoftReferenceExample {
	public static void main(String[] args) {

		ReferenceA a = new ReferenceA();      //Strong Reference

		//Creating Soft Reference to A-type object to which 'a' is also pointing
		SoftReference<ReferenceA> softA = new SoftReference<ReferenceA>(a);

		a = null;    //Now, A-type object to which 'a' is pointing earlier is eligible for garbage collection. 
		//But, it will be garbage collected only when JVM needs memory.


		/**you can retrieve back the object which has been softly referenced. 
		 * It will be done by using get() method.
		 * This method returns reference to the object if object is not cleared from the memory.
		 */
		a = softA.get();
	}
}
