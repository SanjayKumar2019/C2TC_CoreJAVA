package com.cg.bankapplication;

import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAccount;
import com.cg.framework.SavingAccount;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAccount getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		MMSavingAccount sa=new MMSavingAccount(accNo,accNm,accBal,isSalary);
		return sa;
	}

	@Override
	public CurrentAccount getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAccount ca=new MMCurrentAccount(accNo,accNm,accBal,creditLimit);
		return ca;
	}
	
	
	
	

}
