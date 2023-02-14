package org.tnsif.hirerchicalinheritance;

//to demonstrate on hierarchical inheritance
//parent class
public class AndroidVersion {
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public AndroidVersion() {
		System.out.println("Parent class-Android version");
	}

	public AndroidVersion(String type) {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return "AndroidVersion [type=" + type + "]";
	}
	

}