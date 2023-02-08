package org.tnsif.superkeyword;

public class Duster extends Renault{
	private int speed=120;
	public void print()
	{
		//iit will call to parent clss method
		super.print();
		System.out.println("the speed od duster is: "+speed);
		
	}
	
}
