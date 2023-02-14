package org.tnsif.interfacedemo;

//program to demonstrate on multiple inheritance using interface
//driver class
public class MultipleInterfaceExecutor {

	public static void main(String[] args) {
		User obj=new User();
		System.out.println(obj.LoanType());
		System.out.println(obj.getInterest());

	}

}
