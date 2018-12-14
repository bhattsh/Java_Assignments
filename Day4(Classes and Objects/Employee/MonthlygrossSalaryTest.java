import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MonthlygrossSalaryTest {


	private EmployeeDetails employeeOne;
	
	@Before
	public void setUp()
	{
		employeeOne = new EmployeeDetails(101);
		employeeOne.setMonthlyBasic(10000);
	}
	
	@Test
	public void annualBasicTest() {
		assertEquals(17050,employeeOne.getMonthlyGrossSalary(),0);
	}

}
