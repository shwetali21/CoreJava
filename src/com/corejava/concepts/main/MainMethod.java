package com.corejava.concepts.main;

/**We can overload main() method.
 * A Java class can have any number of main() methods. But to run the java class, 
 * a class should have main() method with signature as “public static void main(String[] args)”.
 * If you do any modification to this signature, compilation will be successful.
 * But, you can’t run the java program. You will get run time error as main method not found.
 * */
public class MainMethod {
	public static void main(String[] args) {
		System.out.println("Execution starts from this method");
	}

	void main(int args) {
		System.out.println("Another main method");
	}

	double main(int i, double d) {
		System.out.println("Another main method");
		return d;
	}
}