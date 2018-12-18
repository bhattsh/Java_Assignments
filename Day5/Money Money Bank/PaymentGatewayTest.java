import static org.junit.Assert.*;

import org.junit.Test;

public class PaymentGatewayTest {

	private SavingAccount accountOne = new SavingAccount("rohan",1000);
	private SavingAccount accountTwo = new SavingAccount("shubham",2000);

	@Test
	public void testOfSuccessfullMoneyTransfer() {
		
		assertEquals(true,PaymentGateway.transfer(accountOne, accountTwo, 500));
		assertEquals(2500,accountTwo.getAccountBalance(),0);    //balance of accountTwo changed to 2500 from 500 as 500 is deposited to this account
		assertEquals(500,accountOne.getAccountBalance(),0);     //balance of accountOne changed  to 500 as 500 is transferred to accountTwo 
	}

	@Test
	public void testOfUnSuccessfullMoneyTransfer() {
		
		assertEquals(false,PaymentGateway.transfer(accountOne, accountTwo, 5000));
		assertEquals(2000,accountTwo.getAccountBalance(),0);    //balance of accountTwo is not changed as money is not deposited
		assertEquals(1000,accountOne.getAccountBalance(),0);     //balance of accountOne will not change as money it was trying to transfer is greater than account balance. So nothing transferred 
	}
}
