package org.tnsif.accessspecifier;

public class AccessSpecifierExample {

	//data members
	public 	String name;
	//if any datamember is defautl it will be access only inside the same package
	public void display()
	{
		System.out.println("the name is: "+name);
	}
	
	//getrter and setter for private data member
	public String getName()
	{
		return name; 
	}
	public void setName(String name)
	{
		this.name = "name";
	}
	
}
