package com.mmbank.framework;
/**
 * 
 * @author Shubham Bhatt
 *BankAccount is an abstract class and super class for all types of account in Money Money Bank
 */
public abstract class BankAccount
{
	private static int nextAccountNumber = 10;
	
	private int accountNumber;
	private double accountBalance;
	private String accountHolderName;
	
	
	/**
	 * Parameterized Constructor
	 * @param accountNumber
	 * @param accountHolderName
	 * @param accountbalance
	 */
	public BankAccount( String accountHolderName, double accountbalance)
	{
		this.accountNumber = nextAccountNumber++;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountbalance;
		
		System.out.println(accountNumber);
	}
	
	


	/**
	 * abstract method that will be used to withdaw amount from the accounts of different types
	 * @param amountToWithdraw
	 * @throws InsufficientException 
	 * @throws InvalidAmountException 
	 */
	public abstract void withdraw(double amountToWithdraw) throws InvalidAmountException;
	
	
	/**
	 * method to deposit amount in a account
	 * @param amountToDeposit
	 * @throws InvalidAmountException 
	 */
	public void deposit(double amountToDeposit) throws InvalidAmountException
	{
		if(amountToDeposit > 0)
			accountBalance += amountToDeposit;
		
		else
			throw new InvalidAmountException("please enter a valid amount");
	}

	
	/**
	 * method to return required values in object as a string 
	 */
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber
				+ ", accountBalance=" + accountBalance + ", accountHolderName="
				+ accountHolderName + "]";
	}


	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance (double amount)
	{
		accountBalance = amount;
	}
	
}
