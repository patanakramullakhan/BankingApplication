package com.akram.entity;

public class TransferResult {
	
	private long accountNumber;
	private double amount;
	private double prevBal;
	private double currBal;
	private long transferAccountNumber;
	private double transferCurrBal;
	private double transferPrevBal;
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getPrevBal() {
		return prevBal;
	}
	public void setPrevBal(double prevBal) {
		this.prevBal = prevBal;
	}
	public double getCurrBal() {
		return currBal;
	}
	public void setCurrBal(double currBal) {
		this.currBal = currBal;
	}
	public long getTransferAccountNumber() {
		return transferAccountNumber;
	}
	public void setTransferAccountNumber(long transferAccountNumber) {
		this.transferAccountNumber = transferAccountNumber;
	}
	public double getTransferCurrBal() {
		return transferCurrBal;
	}
	public void setTansferCurrBal(double transferCurrBal) {
		this.transferCurrBal = transferCurrBal;
	}
	public double getTransferPrevBal() {
		return transferPrevBal;
	}
	public void setTransferPrevBal(double transferPrevBal) {
		this.transferPrevBal = transferPrevBal;
	}
	

}
