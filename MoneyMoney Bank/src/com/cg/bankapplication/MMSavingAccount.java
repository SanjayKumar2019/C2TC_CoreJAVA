package com.cg.bankapplication;

import com.cg.framework.SavingAccount;

public class MMSavingAccount extends SavingAccount {
	private static final float MINBAL=2; 
	public MMSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		
	}
	

	public static float getMinbal() {
		return MINBAL;
	}


	public void withdraw(float accBal)
	{
		System.out.println("Withdrawl amount:"+accBal);
	}

	@Override
	public String toString() {
		return "MMSavingAccount [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
}
