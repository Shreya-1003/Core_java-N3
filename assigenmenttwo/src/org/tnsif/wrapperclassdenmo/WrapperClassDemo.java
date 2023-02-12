package org.tnsif.wrapperclassdenmo;

//pogra,m to demonstate on auto and unboxing
public class WrapperClassDemo {

	public static void main(String[] args) {
		// autoboxing
		int x = 18;
		Integer y = x;
		System.out.println(y);
		
		//unboxing
		Integer i = new Integer(10);
		System.out.println(i);
		int b = i.intValue();
		System.out.println(b);
		

	}

}
