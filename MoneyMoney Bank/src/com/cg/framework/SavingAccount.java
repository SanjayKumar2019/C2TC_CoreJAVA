package com.cg.framework;

public abstract class SavingAccount extends BankAccount
{
	private boolean isSalary;
	//private Object isSalaried;
	private static final float MINBAL=100;
	public SavingAccount(int accNo,String accNm,float accBal,boolean isSalary)
	{
		super(accNo,accNm,accBal);
		this.isSalary=isSalary;
	}
	
	public void withdraw(float accBal)
	{
		System.out.println("Remaining balace after withdraw :"+accBal);
	}

	@Override
	public String toString() {
		return "SavingAccount [isSalary=" + isSalary + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public boolean isSalaried() 
	{
		return (boolean) isSalary;
	}
	public void setSalaried(boolean isSalary)
	{
		this.isSalary = isSalary;
	}
	public static float getMinbal() 
	{
		return MINBAL;
	}
}
