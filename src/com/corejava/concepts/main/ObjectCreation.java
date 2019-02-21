package com.corejava.concepts.main;

/**Different ways of Creating Object*/
public class ObjectCreation implements Cloneable {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		//Using new operator
		ObjectCreation objNew = new ObjectCreation();


		//Using newInstance() Method
		try {
			Class c = Class.forName("com.corejava.concepts.main.ObjectCreation");
			ObjectCreation obj = (ObjectCreation) c.newInstance();
			System.out.println("Class: " + c + "\nObject: " + obj);

		} catch (ClassNotFoundException e) {
			System.out.println("Class.forName() method throws ClassNotFoundException");
		} catch (InstantiationException | IllegalAccessException e) {
			System.out.println("newInstance() method throws :: InstantiationException | IllegalAccessException ");
		}


		//Using clone() method.
		//Requires Cloneable interface to be implemented.
		try {
			ObjectCreation objClone = (ObjectCreation) objNew.clone();
			System.out.println("Object created using clone() method ::" + objClone);
		} catch (CloneNotSupportedException e) {
			System.out.println("clone() method throws :: CloneNotSupportedException");
		}


		//Using object deserialization
		/*ObjectInputStream inStream = new ObjectInputStream(anInputStream);
		ObjectCreation object = (ObjectCreation) inStream.readObject();*/


	}
}
