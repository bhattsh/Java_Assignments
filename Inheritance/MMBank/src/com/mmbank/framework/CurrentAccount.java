package com.mmbank.framework;

public abstract class CurrentAccount extends BankAccount
{

	@Override
	public String toString() {
		return "CurrentAccount [toString()=" + super.toString()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	private  final double creditLimit;
	
																				//use of credit Limit here
	public CurrentAccount( String accountHolderName, double accountBalance, double creditLimit)
	{
		super(accountHolderName, accountBalance);
		this.creditLimit = creditLimit;
		
	}

	@Override
	public abstract void withdraw(double amountToWithdraw) throws InvalidAmountException; 
	
	

}
