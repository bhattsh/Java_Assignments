package account;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class TestSavingAccount 
{

	private SavingAccount accountOne;
	private SavingAccount accountTwo;
	private SavingAccount accountThree;
	private SavingAccount accountFour;
	private SavingAccount accountFive;
	
	List <SavingAccount> listOfSavingAccounts;
	
	@Before
	public void setUp()
	{
		accountOne = new SavingAccount("Shubham",22000,1);
		accountTwo = new SavingAccount("Rohan",25000,2);
		accountThree = new SavingAccount("Tushar",20000,3);
		accountFour = new SavingAccount("Tejas",30000,1);
		accountFive = new SavingAccount("Pranjal", 15000,2);
		
		listOfSavingAccounts = new ArrayList <SavingAccount>();
		
		listOfSavingAccounts.add(accountOne);
		listOfSavingAccounts.add(accountTwo);
		listOfSavingAccounts.add(accountThree);
		listOfSavingAccounts.add(accountFour);
		listOfSavingAccounts.add(accountFive);
	}
	
	
	@Test
	public void arrayListOfSavingAccountTest() 
	{
		String resultAsAString="";
		
		for(SavingAccount saving : listOfSavingAccounts)   
			resultAsAString += saving.toString();			//elements will be printed according to insertion order
		
		assertEquals("SavingAccount [accountHolderName=Shubham, accountBalance=22000.0, accountId=1]SavingAccount [accountHolderName=Rohan, accountBalance=25000.0, accountId=2]SavingAccount [accountHolderName=Tushar, accountBalance=20000.0, accountId=3]SavingAccount [accountHolderName=Tejas, accountBalance=30000.0, accountId=1]SavingAccount [accountHolderName=Pranjal, accountBalance=15000.0, accountId=2]",
						resultAsAString);
	}

	
	@Test
	public void serializeAndDeserializeArrayListOfSavingAccountTest() 
	{
		BankAccountList accountList = new BankAccountList();
		try 
		{
			accountList.serializeSavingAccount(listOfSavingAccounts,"savingAccountFile.txt");
			List<SavingAccount> listOfAccounts = (List<SavingAccount>) accountList.deserializeSavingAccount("savingAccountFile.txt");
			assertEquals("[SavingAccount [accountHolderName=Shubham, accountBalance=22000.0, accountId=1], SavingAccount [accountHolderName=Rohan, accountBalance=25000.0, accountId=2], SavingAccount [accountHolderName=Tushar, accountBalance=20000.0, accountId=3], SavingAccount [accountHolderName=Tejas, accountBalance=30000.0, accountId=1], SavingAccount [accountHolderName=Pranjal, accountBalance=15000.0, accountId=2]]",
							listOfAccounts.toString());
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	
	@Test
	public void noDuplicateAndSortedArrayListTest() 
	{
		BankAccountList accountList = new BankAccountList();
		
				
				try 
				{
					accountList.serializeSavingAccountWithoutDuplicates(listOfSavingAccounts,"savingAccountFileWithOutduplicates.txt");
					TreeSet<SavingAccount> listOfAccounts = (TreeSet<SavingAccount>)accountList.deserializeSavingAccount("savingAccountFileWithOutduplicates.txt");
					assertEquals("[SavingAccount [accountHolderName=Shubham, accountBalance=22000.0, accountId=1], SavingAccount [accountHolderName=Rohan, accountBalance=25000.0, accountId=2], SavingAccount [accountHolderName=Tushar, accountBalance=20000.0, accountId=3]]",
							listOfAccounts.toString());
				} 
				catch (ClassNotFoundException e)
				{
					e.printStackTrace();
				}
				 
				catch (IOException e)
				{	
					e.printStackTrace();
				}
	}
	
}
