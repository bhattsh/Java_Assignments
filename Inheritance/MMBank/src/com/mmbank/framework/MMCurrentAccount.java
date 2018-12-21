package com.mmbank.framework;

/**
 * MMCurrentAccount is a subclass of an abstract class CurrentAccount which
 * overrides the withdraw() method
 * 
 * @author sbhatt1
 *
 */
public class MMCurrentAccount extends CurrentAccount {

	private final double creditLimit;

	/**
	 * Parameterized constructor to initialize creditLimit and fields of
	 * superClass
	 * 
	 * @param accountHolderName
	 * @param accountBalance
	 * @param creditLimit
	 */
	public MMCurrentAccount(String accountHolderName, double accountBalance,
			double creditLimit) {
		super(accountHolderName, accountBalance, creditLimit);
		this.creditLimit = creditLimit; // lazy initialization of credit limit
	}

	/**
	 * overriding method which will withraw money from the Current Account if
	 * amount to withdraw is valid
	 */
	@Override
	public void withdraw(double amountToWithdraw) throws InvalidAmountException {
		if (super.getAccountBalance() + creditLimit >= amountToWithdraw) {
			double balance = super.getAccountBalance();
			super.setAccountBalance(balance - amountToWithdraw);
		}

		else {
			throw new InvalidAmountException("Exceeding credit limit");

		}
	}

	
	@Override
	public String toString() {
		return "MMCurrentAccount [toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
