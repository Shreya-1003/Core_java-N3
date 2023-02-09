package org.tnsif.finalkeyword;
//program to demonstrate on final keyword with variab
public class FinalVariable {
	
	final static  int x = 15;
	public static void print()
	{
//		we cant change the value of x here as x is finL 
//		x  = 17 
		System.out.println("the value of x is: "+x);
	}
	public static void main(String args[])
	{
		FinalVariable.print();
	}
}
