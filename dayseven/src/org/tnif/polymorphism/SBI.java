package org.tnif.polymorphism;

public class SBI extends RBI{
	float getInterest()
	{
		//use super to call the parent call object without using object method bcz its esy to use.
		System.out.println(super.getInterest());
		return 12.5f;
	}
}
	


