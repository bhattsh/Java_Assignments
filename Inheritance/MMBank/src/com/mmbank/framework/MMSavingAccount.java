package com.mmbank.framework;

public class MMSavingAccount extends SavingAccount {

	private static final double minimumBalance;
	
	static 
	{
		minimumBalance = 2000;
	}
	
	
	public MMSavingAccount( String accountHolderName, double accountBalance, boolean isSalaried) 
	{
		super( accountHolderName, accountBalance, isSalaried);
	}

	@Override
	public void withdraw(double amountToWithdraw) throws InvalidAmountException
	{
		if(super.getAccountBalance()-amountToWithdraw>2000 && super.getAccountBalance()>=amountToWithdraw)
		{
			double balance = super.getAccountBalance();
			super.setAccountBalance(balance - amountToWithdraw);
		}
		
		else if(super.getAccountBalance()-amountToWithdraw < 0)
			throw new InvalidAmountException("Insufficient Balance");
		
		else
			throw new InvalidAmountException("can't withdraw! withdrawl will make your minimum balance below 2000 which is not allowed");

	}


	@Override
	public String toString() {
		return "MMSavingAccount [toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";
	}
	
	
}
