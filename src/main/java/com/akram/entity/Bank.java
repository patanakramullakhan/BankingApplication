package com.akram.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sdfc_bank2")
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long accountNumber;
	private String accountName;
	private String password;
	private String confirmPassword;
	private double amount;
	private String gender;
	private long mobile;
	private String address;
	private boolean status;
	
	
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Bank(long accountNumber, String accountName, String password, String confirmPassword, double amount,
			String gender, long mobile, String address, boolean status) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.amount = amount;
		this.gender = gender;
		this.mobile = mobile;
		this.address = address;
		this.status = status;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", accountName=" + accountName + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + ", amount=" + amount + ", gender=" + gender + ", mobile="
				+ mobile + ", address=" + address + ", status=" + status + "]";
	}
	
	
	
	
	
	
}
