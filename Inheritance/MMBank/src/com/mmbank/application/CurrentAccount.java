package com.mmbank.application;

/**
 * CurrentAccount is an abstract class which extends BankAccount class
 * @author sbhatt1
 *
 */
public abstract class CurrentAccount extends BankAccount
{



	private  final double creditLimit;
	
	/**
	 * Parameterized constructor																	
	 * @param accountHolderName
	 * @param accountBalance
	 * @param creditLimit
	 */
	public CurrentAccount( String accountHolderName, double accountBalance, double creditLimit)
	{
		super(accountHolderName, accountBalance);
		this.creditLimit = creditLimit;
		
	}

	
	/**
	 * abstrct method from parent class 
	 */
	@Override
	public abstract void withdraw(double amountToWithdraw) throws InvalidAmountException; 
	
	
	@Override
	public String toString() {
		return "CurrentAccount [toString()=" + super.toString()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
