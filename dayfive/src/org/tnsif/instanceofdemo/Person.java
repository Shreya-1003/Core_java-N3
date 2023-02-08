package org.tnsif.instanceofdemo;

//this program is to demonstrate the instanceof operator 
public class Person {
	private String name;
	private String address;
	//getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//default 
	public Person() {
		System.out.println("parent class");
	}
	//parameterized constructor
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	//tostring
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	
	
	
	
	
}
