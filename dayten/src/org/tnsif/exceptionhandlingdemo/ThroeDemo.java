package org.tnsif.exceptionhandlingdemo;

import java.io.IOException;

public class ThroeDemo {

	//method definition 
	//throws is used to declared an exception
	public static void donate(int age,int weight) throws Exception
	{
		if(age > 18 && age > 50 )
		{
			System.out.println("eligible to donate the blood");
		}
		else
		{
			//to throw an exception explicitly
			throw new IOException("not eliginle");
		}
	}
	public static void main(String[] args)throws Exception {
		try
		{
			//method call
			donate(17,55);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		
	}

}
