package org.tnsif.interfacedemo;

//program to demonstrate on multiple inheritance using interface

//implementable class
public class User implements SBI,HDFC{

	@Override
	public String LoanType() {
		return "Personal Loan";
		}

	@Override
	public float getInterest() {
		return 12.8f;
	}

}
