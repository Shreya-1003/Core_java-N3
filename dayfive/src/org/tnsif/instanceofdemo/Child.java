package org.tnsif.instanceofdemo;

public class Child extends Person{
	
	private int age;

	//getter and setter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
//para
	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}
  
//	public Child(String name, String address) {
//		super(name, address);
//		// TODO Auto-generated constructor stub
//	}
	//default
	public Child(String name,String address,int age) {
		super();
		this.age = age;
	}
//to string

	@Override
	public String toString() {
		return "Child [age=" + age + ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
	}
	
	
	
	
	
}
