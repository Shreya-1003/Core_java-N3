package org.tnif.polymorphism;

//program to demonstrate on method overloading
public class Smartphones {
	private int resolution;
	private String slottype;
	//method overloading in terms of by passing no of arguments
	void display(int resolution)
	{
		System.out.println("camera resolution: "+resolution);
	}
	void display(int resolution,String slottype)
	{
		System.out.println("camera resolution: "+resolution+","+"slotype: "+slottype);
	}
	//getter setter
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	public String getSlottype() {
		return slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}
	
}
