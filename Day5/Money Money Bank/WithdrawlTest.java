import static org.junit.Assert.*;

import org.junit.Test;

public class WithdrawlTest {

	private SavingAccount accountOne = new SavingAccount("rohan",1000); //saving account created with some minimum balance
	private SavingAccount accountTwo = new SavingAccount("shubham",1000);

	@Test
	public void testOfWithDrawingMoney() //amount to withdraw is valid, i.e. less than or equal to account balance
	{
		accountOne.deposit(3000);
		assertEquals(true,accountOne.withDraw(500));
	}

	@Test
	public void testOfUnsuccessfullWithDrawingMoney()    //amount of money to withdraw is greater than account balance
	{
		accountTwo.deposit(3000);
		assertEquals(false,accountTwo.withDraw(5000));
	}
}
