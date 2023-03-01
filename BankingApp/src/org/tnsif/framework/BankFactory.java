package org.tnsif.framework;

public abstract class BankFactory {
	
	public abstract SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried);
	public abstract CurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit);

}
