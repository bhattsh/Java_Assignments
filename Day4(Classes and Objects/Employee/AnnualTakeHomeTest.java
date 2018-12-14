import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AnnualTakeHomeTest {

private EmployeeDetails employeeOne;
	
	@Before
	public void setUp()
	{
		employeeOne = new EmployeeDetails(101);
		employeeOne.setMonthlyBasic(10000);
	}
	
	@Test
	public void MoneyEarnedAnnuallyTest() {
		assertEquals(143400,employeeOne.getAnnualTakeHome(),0);
	}

}
