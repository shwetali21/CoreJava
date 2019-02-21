package com.corejava.concepts.classes;

/**To create immutable class in java, you have to do following steps.*/

//Declare the class as final so it can’t be extended.
public final class ImmutableEmployee {

	//Make all fields private so that direct access is not allowed.
	//Make all mutable fields final so that it’s value can be assigned only once.
	private final String name;
	private final int id;

	//Don’t provide setter methods for variables

	//Performing Deep Copy for Object initialization
	public ImmutableEmployee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "ImmutableEmployee [name=" + name + ", id=" + id + "]";
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
}
