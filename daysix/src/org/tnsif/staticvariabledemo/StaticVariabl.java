package org.tnsif.staticvariabledemo;

public class StaticVariabl {
	//non-static variable
	private String name;
	
	//static variable
	public static 	String companyName = "technoserve india";

	//field
	public StaticVariabl(String name) {
		super();
		this.name = name;
	}
	//to string

	@Override
	public String toString() {
		return "StaticVariabl [name=" + name + "]";
	}
	
	
	

}
