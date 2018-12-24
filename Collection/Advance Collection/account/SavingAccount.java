/**	PROBLEM:
 *  1)	Create a Class SavingAccount with field’s acc_balance, acc_ID, accountHoldername, isSalaryAccount.
 * 		 Also add setter and getter methods with business method like withdraw and deposit.
		a.	Create 5 different object of SavingAccount and add them into ArrayList, now interate the arraylist and 
			display all SavingAccount’s object one by one.
		b.	Now save the ArrayList which contains SavingAccount’s object into a file and read the file and
		 	display all savingAccount Object one by one.
		c.	Create class BankAccountList which will maintain SavingAccount objects. Ensure that this class should not allow 
			duplicates as well as data should be displayed in sorted order. (as per acc_ID)  

 */
package account;

import java.io.Serializable;
import java.util.Comparator;

/**
 * 
 * @author Shubham Bhatt
 *Saving account is a public class for creating saving accounts and providing withdraw and deposit facilities to the customers
 */
public class SavingAccount implements Serializable,Comparable<SavingAccount>
{

	//private static int generateAccountNumber=0;
	private String accountHolderName;
	private double accountBalance;
	private int accountId;
	

	/**
	 * parameterized constructor to create saving account
	 * @param accountHolderName
	 * @param accountBalance
	 */
	public SavingAccount(String accountHolderName, double accountBalance, int accountId)
	{
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	
	/**
	 * getter method to get accountHolder Name
	 * @return
	 */
	public String getAccountHolderName()
	{
		return accountHolderName;
	}


	/**
	 * getter method to get account Balance
	 * @return
	 */
	public double getAccountBalance()
	{
		return accountBalance;
	}


	/**
	 * getter method to get account number
	 * @return
	 */
	public int getAccountId()
	{
		return accountId;
	}


	/**
	 * overridden method from Object class
	 */
	@Override
	public String toString() {
		return "SavingAccount [accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + ", accountId="
				+ accountId + "]";
	}


	/**
	 * method to withdraw money from the saving accounts
	 * @param amountToWithdraw
	 * @throws invalidAmountException
	 * @throws insufficientBalanceException
	 */
	public void withdraw(double amountToWithdraw) throws invalidAmountException,insufficientBalanceException
	{
		if(amountToWithdraw <= accountBalance && amountToWithdraw > 0)
			this.accountBalance -= amountToWithdraw;
		
		else if(amountToWithdraw < 1)
			throw new invalidAmountException("amount to withdraw should be greater than zero");
		else
			throw new insufficientBalanceException("Insufficient balance");
	}
	
	
	/**
	 * method to deposit money in the saving account
	 * @param amountToDeposit
	 * @throws invalidAmountException
	 */
	public void deposit(double amountToDeposit) throws invalidAmountException
	{
		if(amountToDeposit > 0)
			accountBalance += amountToDeposit;
		else
			throw new invalidAmountException("please enter amount greater than zero.");
	}


	/**
	 * compareTo method will compare the elements and then stores them in TreeSet
	 * Duplicate objects will not get added to TreeSet
	 * Objects will be stored in ascending order of accountId in TreeSet 
	 */
	@Override
	public int compareTo(SavingAccount accountToCompare) {
		if(this.accountId < accountToCompare.accountId)
			return -1;
		else if(this.accountId == accountToCompare.accountId)
			return 0;
		else
			return 1;
	}
}
