package org.tnsif.abstractiondemo;

//program to demonstrate on abstract c lass and abstract method
//these is a abstract  class
public abstract class Menu {
	abstract void receipe();
	abstract void foodtype();
	//concrete method means non abstract method
	void menutype()
	{
		System.out.println("veg and non-veg");
	}

}
