package com.mmbank.framework;

public abstract class Bankfactory 
{
	public abstract MMSavingAccount getNewSavingAccount( String accountHolderName, double accountBalance, boolean isSalaried);
	
	public abstract MMCurrentAccount getNewCurrentAccount( String accountHolderName, double accountBalance, double creditLimit);
	
	
}
