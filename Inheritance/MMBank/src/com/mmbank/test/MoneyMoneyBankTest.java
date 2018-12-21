package com.mmbank.test;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.mmbank.framework.*;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

/**
 * MoneyMoneyBankTest is a JUnit test class to test different functionalities or services of MMBank
 * @author sbhatt1
 *
 */
public class MoneyMoneyBankTest {

	private BankFactory bank;
	
	@Before
	public void setUp()
	{
		bank = new MMBankFactory();
	}
	

	@Test
	public void testOfScuccessfullWithdrawlFromSavingAccount() 
	{
		MMSavingAccount accountOne = bank.getNewSavingAccount("shubham",20000,false);
		
		Logger log = Logger.getLogger(MoneyMoneyBankTest.class);
	    BasicConfigurator.configure();
		
		try {
			log.info("money withdrawing process statrted");
			accountOne.withdraw(1000);
		} 
		catch (InvalidAmountException e)
		{
			log.error("please enter a valid amount");
			e.printStackTrace();
		}
		
	}

	
	@Test
	public void testOfUnscuccessfullWithdrawlFromSavingAccount() 
	{
		MMSavingAccount accountOne = bank.getNewSavingAccount("shubham",20000,false);
		
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
		MMCurrentAccount accountCurrent = bank.getNewCurrentAccount("Rohan",30000, 5000);
		
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
		MMCurrentAccount accountCurrent = bank.getNewCurrentAccount("Rohan",30000, 5000);
		
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
		MMCurrentAccount accountCurrent = bank.getNewCurrentAccount("Rohan",30000, 5000);
		System.out.println(accountCurrent.toString());
	}
}
