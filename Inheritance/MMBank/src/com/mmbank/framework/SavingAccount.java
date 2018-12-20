package com.mmbank.framework;

public abstract class SavingAccount extends BankAccount 
{

	private boolean isSalaried;
	private static final double minimumBalance;
	
	
	static 
	{
		minimumBalance = 2000;
	}
	
	
	public SavingAccount( String accountHolderName, double accountBalance, boolean isSalaried)
	{
		super( accountHolderName, accountBalance);
		this.isSalaried = isSalaried;
	}
		
	
	public abstract void withdraw(double amountToWithdraw) throws InvalidAmountException;

	
	@Override
	public String toString() {
		return "SavingAccount [isSalaried=" + isSalaried + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
