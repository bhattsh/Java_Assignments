package com.organisation;

public class MMASavingAccount
{
	private int accountId;
	private String accountHolderName;
	private double accountBalance;
	private boolean isSalary;
	
	
	public MMASavingAccount(int accountId, String accountHolderName,double accountBalance, boolean isSalary)
	{
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.isSalary = isSalary;
	}


	public int getAccountId() {
		return accountId;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


	public double getAccountBalance() {
		return accountBalance;
	}


	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}


	public boolean isSalary() {
		return isSalary;
	}


	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}


	@Override
	public String toString() {
		return "MMASavingAccount [accountId=" + accountId
				+ ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + ", isSalary="
				+ isSalary + "]";
	}	
	
	
	
}
