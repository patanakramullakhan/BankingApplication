package com.akram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.akram.entity.Bank;
import com.akram.service.BankService;

@Controller
public class BankController {
	
	@Autowired
	private BankService service;
	
	
	@RequestMapping("/")
	public String homePage() {
		return "home";
	}
	
	
	@RequestMapping("/newAccountUrl")
	public String newAccountPage() {
		return "newAccount";
	}
	
	@RequestMapping("/submit-registration")
	public String newAccount(Bank bank) {
		
		Bank save = service.saveAccount(bank);
		if(save!=null) {
			return "success1";
		}
		else {
			return "success2";
		}
	}
	
	
	@RequestMapping("/balanceCheckUrl")
	public String balanceForm() {
		return "balanceCheck";
	}
	
	
	@RequestMapping("/balance-check")
	public String balanceCheck(@RequestParam long accountNumber,@RequestParam String accountName,@RequestParam String password,@RequestParam String confirmPassword,ModelMap model) {
		
		
		model.put("balance", service.balanceCheck(accountNumber, accountName, password, confirmPassword));
		
		return "balanceResult";
	}
	
	@RequestMapping("/depositUrl")
	public String depositForm() {
		return "deposit";
	}
	
	@RequestMapping("/deposit")
	public String deposit(@RequestParam long accountNumber,@RequestParam String accountName,@RequestParam String password,@RequestParam double amount,ModelMap model) {
		model.put("deposit", service.deposit(accountNumber, accountName, password, amount));
		
		return "depositResult";
	}
	
	
	
	@RequestMapping("/withdrawUrl")
	public String withdrawPage() {
		return "withdraw";
	}
	
	@RequestMapping("/withdraw")
	public String withdraw(@RequestParam long accountNumber,@RequestParam String accountName,@RequestParam String password,@RequestParam double amount,ModelMap model) {
		
		model.put("withdraw", service.withdraw(accountNumber, accountName, password, amount));
		return "withdrawResult";
		
	}
	
	
	@RequestMapping("/transferUrl")
	public String transferPage() {
		return "transfer";
	}
	
	@RequestMapping("/transfer")
	public String transfer(@RequestParam long accountNumber,@RequestParam String password,@RequestParam double amount,@RequestParam long transferAccountNumber,ModelMap model) {
		
		model.put("transfer", service.transferAmount(accountNumber, password, amount, transferAccountNumber));
		
		return "transferResult";
		
	}
	
	@RequestMapping("/closeAccountUrl")
	public String closeAccountPage() {
		return "closeAccount";
	}
	
	@RequestMapping("/close-account")
	public String closeAccount(@RequestParam long accountNumber,@RequestParam String accountName,@RequestParam String password,@RequestParam String confirmPassword) {
		
		@SuppressWarnings("unused")
		Bank close = service.closeAccount(accountNumber, accountName, password, confirmPassword);
		
		return "closeAccountResult";
	
	}
	
	
	
	
	
	

}
