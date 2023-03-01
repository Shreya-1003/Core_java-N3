package org.tnsif.application;

import org.tnsif.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}

	@Override
	public void withdraw(float accBal) {
		super.withdraw(accBal);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
	
	

}
