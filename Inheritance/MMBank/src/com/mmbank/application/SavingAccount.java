package com.mmbank.application;

/**
 * SavingAccount is an abstract class which extends BankAccount class
 * @author sbhatt1
 *
 */
public abstract class SavingAccount extends BankAccount 
{

	private boolean isSalaried;
	private static final double minimumBalance;
	
	
	static 
	{
		minimumBalance = 2000;
	}
	
	/**
	 * Parameterized constructor
	 * @param accountHolderName
	 * @param accountBalance
	 * @param isSalaried
	 */
	public SavingAccount( String accountHolderName, double accountBalance, boolean isSalaried)
	{
		super( accountHolderName, accountBalance);
		this.isSalaried = isSalaried;
	}
		
	
	/**
	 *abstract method to withdraw money form Saving accounts 
	 */
	public abstract void withdraw(double amountToWithdraw) throws InvalidAmountException;

	
	@Override
	public String toString() {
		return "SavingAccount [isSalaried=" + isSalaried + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
