import static org.junit.Assert.*;

import org.junit.Test;

public class DepositTest {

	private SavingAccount accountOne = new SavingAccount("shubham");  //saving account with zero balance
	private SavingAccount accoountTwo = new SavingAccount("rohan",1000); //saving account created with some minimum balance
	
	@Test
	public void testOfSuccessfulDepositMoney() {
		assertEquals(true,accountOne.deposit(2000));
	}

	@Test
	public void testOfUnsuccessfulDepositMoney() {
		assertEquals(false,accountOne.deposit(0));
	}
}
