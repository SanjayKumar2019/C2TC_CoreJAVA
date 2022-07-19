package com.cg.bankapplication;

import com.cg.framework.CurrentAccount;

public class MMCurrentAccount extends CurrentAccount {
	public MMCurrentAccount(int accNo,String accNm, float accBal,float creditLimit)
	{
		super(accNo,accNm,accBal,creditLimit);
	}
	public void withdraw(float creditLimit)
	{
		System.out.println("Check the current account balance:" +getAccBal());
	}
	@Override
	public String toString() {
		return "MMCurrentAccount [toString()=" + super.toString() + ", getcreditLimit()=" + getcreditLimit()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	@Override
	public float getcreditLimit() {
		// TODO Auto-generated method stub
		return 0;
	}



	
}
