package com.mmbank.framework;

public class MMCurrentAccount extends CurrentAccount {

	private final double creditLimit;
	
	
	//lazy initialization for credit limit?
	public MMCurrentAccount( String accountHolderName, double accountBalance, double creditLimit) 
	{
		super(accountHolderName, accountBalance, creditLimit);
		this.creditLimit = creditLimit;
	}
	

	public void withdraw(double amountToWithdraw) throws InvalidAmountException
	{
		if(super.getAccountBalance()+creditLimit >= amountToWithdraw)
		{
			double balance = super.getAccountBalance();
			super.setAccountBalance(balance - amountToWithdraw);
		}
		
		else
		{
			throw new InvalidAmountException("Exceeding credit limit");

		}
	}



	@Override
	public String toString() {
		return "MMCurrentAccount [toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
	
}
