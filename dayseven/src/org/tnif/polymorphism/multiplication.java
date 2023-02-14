package org.tnif.polymorphism;

public class multiplication {
	
	//method overloading by changing the datatype
	int mul(int x,int y)
	{
		return x*y;
	}
	int mul(float x,int y)
	{
		return (int) (x*y);
	}
}
