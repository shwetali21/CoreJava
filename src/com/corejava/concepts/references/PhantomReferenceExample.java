package com.corejava.concepts.references;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceExample {
	public static void main(String[] args) {

		ReferenceA a = new ReferenceA();	//Strong Reference

		//Creating Reference Queue
		ReferenceQueue<ReferenceA> refQueue = new ReferenceQueue<ReferenceA>();

		PhantomReference<ReferenceA> phantomA  = new PhantomReference<ReferenceA>(a, refQueue);

		/**Now, A-type object to which 'a' is pointing earlier is available for garbage collection. 
		 * But, this object is kept in 'refQueue' before removing it from the memory.
		 */
		a = null;    			

		a = phantomA.get();    //it always returns null
	}
}
