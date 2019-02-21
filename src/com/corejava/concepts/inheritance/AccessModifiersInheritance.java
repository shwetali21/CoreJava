package com.corejava.concepts.inheritance;

class AccessA {
	private int i;
	int j;
	protected int k;
	public int m;
}

class AccessB extends AccessA {

	void methodOfClassB() {

		//System.out.println(i);     Private member can not be inherited
		System.out.println(j);       //Default member can be inherited within package
		System.out.println(k);       //protected member can be inherited to any subclass
		System.out.println(m);       //public member can be inherited to all sub classes
	}
}

class AccessC extends AccessB {
	void methodOfClassC() {
		System.out.println(j);      //Default member can be inherited within package
		System.out.println(k);      //protected member can be inherited to any subclass
		System.out.println(m);      //public member can be inherited to any subclass

		AccessB b = new AccessB();
		System.out.println(b.j);    //Default member can be used within package
		System.out.println(b.k);    //Protected member can be used anywhere in the package
		System.out.println(b.m);    //Public member can be used anywhere
	}
}

public class AccessModifiersInheritance {

}
