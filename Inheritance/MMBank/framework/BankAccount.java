package framework;
/**
 * 
 * @author Shubham Bhatt
 *BankAccount is an abstract class and super class for all types of account in Money Money Bank
 */
public abstract class BankAccount {

	private int accountNumber;
	private double accountBalance;
	private String accountHolderName;
	
	
	/**
	 * Parameterized Constructor
	 * @param accountNumber
	 * @param accountHolderName
	 * @param accountbalance
	 */
	public BankAccount(int accountNumber, String accountHolderName, double accountbalance)
	{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountbalance;
	}
	
	
	/**
	 * abstract method that will be used to withdaw amount from the accounts of different types
	 * @param amountToWithdraw
	 */
	public abstract void withdraw(double amountToWithdraw);
	
	
	/**
	 * method to deposit amount in a account
	 * @param amountToDeposit
	 */
	public void deposit(double amountToDeposit)
	{
		
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
	
	
}
