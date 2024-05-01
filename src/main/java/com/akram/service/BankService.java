package com.akram.service;

import com.akram.entity.BalanceResult;
import com.akram.entity.Bank;
import com.akram.entity.TransferResult;

public interface BankService {

	public Bank saveAccount(Bank bank);
	public BalanceResult deposit(long accountNumber,String accountName,String password,double amount);
	public BalanceResult withdraw(long accountNumber,String accountName,String password,double amount);
	public Bank balanceCheck(long accountNumber,String accountName,String password,String confirmPassword);
	public TransferResult transferAmount(long accountNumber,String password,double amount,long transferAccountNumber);
	public Bank closeAccount(long accountNumber,String accountName,String password,String confirmPassword);
	
	
	
}
