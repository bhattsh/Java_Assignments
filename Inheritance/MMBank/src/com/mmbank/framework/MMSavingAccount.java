package com.mmbank.framework;

/**
 * MMSavingAccount class extends an abstract class  SavingAccount 
 * @author sbhatt1
 *
 */
public class MMSavingAccount extends SavingAccount {

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
	public MMSavingAccount( String accountHolderName, double accountBalance, boolean isSalaried) 
	{
		super( accountHolderName, accountBalance, isSalaried);
	}

	/**
	 * overriding method inherited from SavingAccount class which is used to withdraw money from the current account
	 */
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
