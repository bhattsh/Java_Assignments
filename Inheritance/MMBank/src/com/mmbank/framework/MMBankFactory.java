package com.mmbank.framework;

/**
 * MMBankFactory is a subclass of an abstract class BankFactory which overrides the methods of BankFactory class 
 * @author sbhatt1
 *
 */
public class MMBankFactory extends BankFactory {

	/**
	 * overriding method which returns an object of MMSavingAccount
	 */
	@Override
	public MMSavingAccount getNewSavingAccount( String accountHolderName, double aacountBalance, boolean isSalaried)
	{
		return new MMSavingAccount(accountHolderName, aacountBalance, isSalaried);
	}
	
	
	/**
	 * toString method to return object values as a string
	 */
	@Override
	public String toString() {
		return "MMBankFactory [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	/**
	 * overriding method which returns an object of MMCurrentAccount
	 */
	@Override
	public MMCurrentAccount getNewCurrentAccount(String accountHolderName, double aacountBalance, double creditLimit)
	{
		return new MMCurrentAccount( accountHolderName, aacountBalance, creditLimit);
	}	
	
}