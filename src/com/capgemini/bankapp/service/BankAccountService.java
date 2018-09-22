package com.capgemini.bankapp.service;
public interface BankAccountService {

	
	public double getBalance(long accountId);
	public boolean withdraw(long accountId, double amount);
	public boolean deposit(long accountId, double amount);
	public boolean fundTransfer(long fromAcc, long toAcc, double amount);

}