package com.mmbank.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.mmbank.framework.*;

public class MoneyMoneyBankTest {

	private Bankfactory bank = new MMBankFactory();
	MMSavingAccount accountOne;
	MMCurrentAccount accountCurrent;
	@Before
	public void setUp()
	{
		accountOne = bank.getNewSavingAccount("shubham",20000,false);
		accountCurrent = bank.getNewCurrentAccount("Rohan",30000, 5000);
	}
	
	@Test
	public void testOfScuccessfullWithdrawlFromSavingAccount() 
	{
		
		try {
			accountOne.withdraw(1000);
		} 
		catch (InvalidAmountException e) {
			System.out.println("inside catch");
			e.printStackTrace();
		}
	}

	
	@Test
	public void testOfUnscuccessfullWithdrawlFromSavingAccount() 
	{
		
		try {
			accountOne.withdraw(34000);
		} 
		catch (InvalidAmountException e) {
			System.out.println("inside catch");
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testOfUnscuccessfullWithdrawlFromCurrentAccount() 
	{
		try {
			accountCurrent.withdraw(36000);
		} 
		catch (InvalidAmountException e) {
			System.out.println("inside catch of current");
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testOfscuccessfullWithdrawlFromCurrentAccount() 
	{
		try {
			accountCurrent.withdraw(3000);
		} 
		catch (InvalidAmountException e) {
			System.out.println("inside catch of current but this should not happen");
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testOfscuccessfullRetrievalOfAccountDetailsFromCurrentAccount() 
	{
		System.out.println(accountCurrent.toString());
	}
}
