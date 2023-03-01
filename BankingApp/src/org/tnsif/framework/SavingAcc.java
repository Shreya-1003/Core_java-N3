package org.tnsif.framework;

public abstract class SavingAcc extends BankAcc {
	
	
	private boolean isSalaried;
	//private static final float MINBAL=0.0f; 

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried= isSalaried;
	}
	
	@Override
	public void withdraw(float bal) {
		System.out.println("Money withdrawn: "+ bal);
		System.out.println("AccNO: "+ this.getAccNo() + " accName: "+ this.getAccNm()+ " accBalance: "+ (this.getAccBal() - bal));

	}
	
	@Override
	public String toString() {
		return "SavingAcc [AccNO:"+ getAccNo() + " accName:"+ getAccNm()+ " accBalance:"+ getAccBal() +" isSalaried=" + isSalaried +"]";
	}
}