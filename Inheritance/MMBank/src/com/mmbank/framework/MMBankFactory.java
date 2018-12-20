package com.mmbank.framework;


public class MMBankFactory extends Bankfactory {

	@Override
	public MMSavingAccount getNewSavingAccount( String accountHolderName, double aacountBalance, boolean isSalaried)
	{
		return new MMSavingAccount(accountHolderName, aacountBalance, isSalaried);
	}
	
	@Override
	public String toString() {
		return "MMBankFactory [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public MMCurrentAccount getNewCurrentAccount(String accountHolderName, double aacountBalance, double creditLimit)
	{
		return new MMCurrentAccount( accountHolderName, aacountBalance, creditLimit);
	}	
	
}