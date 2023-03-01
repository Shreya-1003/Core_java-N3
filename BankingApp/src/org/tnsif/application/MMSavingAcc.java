package org.tnsif.application;

import org.tnsif.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
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