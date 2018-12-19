package test;

import static org.junit.Assert.*;

import org.junit.Test;

import framework.Bankfactory;
import framework.CurrentAccount;
import framework.MMBankFactory;
import framework.MMCurrentAccount;
import framework.MMSavingAccount;
import framework.SavingAccount;

public class MoneyMoneyBankTest {

	private Bankfactory bank = new MMBankFactory();
	private SavingAccount saving = new MMSavingAccount();
	private CurrentAccount current = new MMCurrentAccount();
	
	@Test
	public void test() {
	
	}

}
