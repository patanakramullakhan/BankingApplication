package com.akram.service;

import javax.security.auth.login.AccountException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akram.entity.BalanceResult;
import com.akram.entity.Bank;
import com.akram.entity.TransferResult;
import com.akram.repo.BankRepo;

@Service
public class BankServiceImp implements BankService {

	
	@Autowired
	private BankRepo repo;
	
	
	@Override
	public Bank saveAccount(Bank bank) {

		bank.setStatus(true);
		Bank s=repo.save(bank);
		
		return s;
	}

	@Override
	public BalanceResult deposit( long accountNumber, String accountName, String password, double amount) {

		
		
		Bank account = repo.findById(accountNumber).get();
		
		
		
		BalanceResult result = null;
		
		if(account.getAccountNumber()==accountNumber && account.getAccountName().equals(accountName) &&account.getPassword().equals(password) &&account.isStatus()) {
			
			double prevBal = account.getAmount();
			double currBal = prevBal+amount;
			
			account.setAmount(currBal);
			repo.save(account);
			result = new BalanceResult();
			result.setAmount(amount);
			result.setPreviousAmount(prevBal);
			result.setCurrentAmount(currBal);
			
			return result;
					
		}
		else {
			return result;
		}
	
	}

	@Override
	public BalanceResult withdraw(long accountNumber, String accountName, String password, double amount) {

		Bank user = repo.findById(accountNumber).get();
		BalanceResult result = null;
		
		if(user.getAccountNumber()==accountNumber && user.getAccountName().equals(accountName) &&user.getPassword().equals(password)&&user.isStatus()) {
			
			result = new BalanceResult();
			double prevBal = user.getAmount();
			double currBal = prevBal - amount;
			
			user.setAmount(currBal);
			repo.save(user);
			result.setAmount(amount);
			result.setPreviousAmount(prevBal);
			result.setCurrentAmount(currBal);
			return result;
			
		}
		else {
			return result;
		}
	
	}

	@Override
	public Bank balanceCheck(long accountNumber, String accountName, String password,
			String confirmPassword) {
		
		Bank customer = repo.findById(accountNumber).get();
		
		if(customer.getAccountNumber()==accountNumber && customer.getAccountName().equals(accountName) && customer.getPassword().equals(password) && customer.getConfirmPassword().equals(confirmPassword) && customer.isStatus()) {
			return customer;
		}
		else {
			customer = null;
			return customer;
		}
		
	}

	@Override
	public TransferResult transferAmount(long accountNumber, String password, double amount, long transferAccountNumber) {

		Bank fromAcc = repo.findById(accountNumber).get();
		Bank toAcc = repo.findById(transferAccountNumber).get();
		TransferResult result = null;
		
		if(fromAcc.getAccountNumber()==accountNumber && fromAcc.getPassword().equals(password)) {
			
			double prevBal = fromAcc.getAmount();
			double currBal = prevBal - amount;
			
			fromAcc.setAmount(currBal);
			repo.save(fromAcc);
			
			result = new TransferResult();
			result.setAccountNumber(accountNumber);
			result.setAmount(amount);
			result.setPrevBal(prevBal);
			result.setCurrBal(currBal);
			
			double tranPrevBal = toAcc.getAmount();
			double tranCurrBal = tranPrevBal + amount;
			
			toAcc.setAmount(tranCurrBal);
			repo.save(toAcc);
			result.setTransferAccountNumber(transferAccountNumber);
			result.setTransferPrevBal(tranPrevBal);
			result.setTansferCurrBal(tranCurrBal);
			
			return result;
			
		}
		else {
			return result;
		}
		

	}

	@Override
	public Bank closeAccount(long accountNumber, String accountName, String password, String confirmPassword) {

		Bank user = repo.findById(accountNumber).get();
		
		
		
		if(user.getAccountNumber()==accountNumber && user.getAccountName().equals(accountName) && user.getPassword().equals(password) && user.getConfirmPassword().equals(confirmPassword)) {
			
			user.setStatus(false);
			repo.save(user);
			
			return user;
		}
		else {
			user = null;
			return user;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
