package com.corejava.concepts.references;

import java.lang.ref.WeakReference;

public class WeakReferenceExample {
	public static void main(String[] args) {

		ReferenceA a = new ReferenceA();      //Strong Reference
       
		//Creating Weak Reference to A-type object to which 'a' is also pointing.
        WeakReference<ReferenceA> weakA = new WeakReference<ReferenceA>(a);
        
        a = null;    //Now, A-type object to which 'a' is pointing earlier is available for garbage collection.
        a = weakA.get();    //You can retrieve back the object which has been weakly referenced.
	}
}
