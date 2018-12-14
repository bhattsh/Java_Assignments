import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class monthlyDeductionTest {

private EmployeeDetails employeeOne;
	
	@Before
	public void setUp()
	{
		employeeOne = new EmployeeDetails(101);
		employeeOne.setMonthlyBasic(10000);
	}
	
	@Test
	public void monthlyDeductionTest() {
		assertEquals(5100,employeeOne.getMonthlyDeduction(),0);
	}
}
