package org.tnif.polymorphism;

public class HondaCity {
	private int speed;
	private String color;
	//getter setter
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//default constructor
	public HondaCity() {
		System.out.println("i like to drivw hondacity:");
		
	}
	
	//parameterized constructor
	public HondaCity(int speed, String color) {
		super();
		this.speed = speed;
		this.color = color;
		System.out.println("speed is:"+speed+"color is: "+color );
	}
	
	
	
	
	

}
