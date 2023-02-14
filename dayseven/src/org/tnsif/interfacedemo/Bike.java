package org.tnsif.interfacedemo;

public interface Bike {
	
	/*variable must be public static final*/
	//private int speed;
	int speed=45;
	
	//by default all the methods are abstract in an interface
	void milage(int speed);
	void engine();

}