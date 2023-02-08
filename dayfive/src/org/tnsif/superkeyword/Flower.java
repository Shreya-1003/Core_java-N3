package org.tnsif.superkeyword;

public class Flower {
	private String name;

	//getter and setter 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//default
	public Flower() {
		System.out.println("Flower-parent class");
	}
//para
	public Flower(String name) {
		super();
		this.name = name;
	}
	
	
	
	
}
