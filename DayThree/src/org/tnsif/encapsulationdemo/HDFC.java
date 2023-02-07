package org.tnsif.encapsulationdemo;

public class HDFC {

	//data member
	private int pin;
	void accept()
	{
		System.out.println("The atm: "+pin);
	}
	
	//getter and setters
	public int getPin()
	{
		return pin;
	}
	public void setPin(int pin)
	{
		this.pin = pin;
	}
}
