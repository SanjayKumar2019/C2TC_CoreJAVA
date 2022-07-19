package com.cg.framework;

public abstract class CurrentAccount extends BankAccount {
	private final float creditLimit=1000;
	
	public CurrentAccount(int accNo,String accNm,float accBal,float creditLimit) {
		super(accNo,accNm,accBal);
		
	}
	public void withdraw(float creditLimit) 
	{
		System.out.println("Credit Limit:" +creditLimit);
	}
	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public abstract float getcreditLimit();

	
}
