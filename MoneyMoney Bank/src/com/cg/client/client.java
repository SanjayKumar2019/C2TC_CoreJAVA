package com.cg.client;

import com.cg.bankapplication.MMBankFactory;
import com.cg.bankapplication.MMCurrentAccount;
import com.cg.bankapplication.MMSavingAccount;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAccount;
import com.cg.framework.SavingAccount;

public class client {

	public static void main(String[] args) {

		BankFactory bf=new MMBankFactory();
		SavingAccount sa=new MMSavingAccount(39736,"SAVING",40000,true);
		CurrentAccount ca=new MMCurrentAccount(39736,"Saving",50000,5000);
		sa.withdraw(sa.getAccBal());
		ca.withdraw(ca.getcreditLimit());
	}

}
