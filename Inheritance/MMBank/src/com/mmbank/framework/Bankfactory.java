package com.mmbank.framework;

/**
 * Abstract class BankFactory has two abstract mehtod MmSavingAccount() and MmCurrentAccount  
 * @author sbhatt1
 *
 */
public abstract class BankFactory 
{
	/**
	 * abstract method which returns the object of MMSavingAccount
	 * @param accountHolderName
	 * @param accountBalance
	 * @param isSalaried
	 * @return
	 */
	public abstract MMSavingAccount getNewSavingAccount( String accountHolderName, double accountBalance, boolean isSalaried);
	
	
	/**
	 * abstract method which returns the object of MMCurrentAccount
	 * @param accountHolderName
	 * @param accountBalance
	 * @param creditLimit
	 * @return
	 */
	public abstract MMCurrentAccount getNewCurrentAccount( String accountHolderName, double accountBalance, double creditLimit);
	
	
}
