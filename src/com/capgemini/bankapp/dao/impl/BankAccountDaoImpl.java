package com.capgemini.bankapp.dao.impl;


import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.database.DummyDataBase;
import com.capgemini.bankapp.model.BankAccount;

public class BankAccountDaoImpl implements BankAccountDao {
	

	public BankAccountDaoImpl() {
		
	}

	@Override
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		for (BankAccount bankAccount : DummyDataBase.bankData) {
			if(bankAccount.getAccountId()==accountId)
			{
				return bankAccount.getBalance();
			}
		}
		return -1;
	}

	@Override
	public boolean updateBalance(long accountId, double amount) {
		// TODO Auto-generated method stub
		for (BankAccount bankAccount : DummyDataBase.bankData) {
			if(bankAccount.getAccountId()==accountId)
			{
				if(bankAccount.getBalance()+amount>=0) {
				bankAccount.setBalance(bankAccount.getBalance()+amount);
				System.out.println(bankAccount.getBalance());
				return true;
				}
			}
		}
		return false;
	}
}