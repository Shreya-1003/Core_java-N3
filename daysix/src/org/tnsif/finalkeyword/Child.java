package org.tnsif.finalkeyword;
//if any method is declared as final in parent class and we are going to use that method inside the child class then we cant overide but we can overload
public class Child extends Parent{
	private String name;
	final void display(String name)
	{
		System.out.println("the name is :"+name);
	}
	//getter setter 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
