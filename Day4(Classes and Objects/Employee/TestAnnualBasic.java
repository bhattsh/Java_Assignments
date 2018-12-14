import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


public class TestAnnualBasic {

	private EmployeeDetails employeeOne;
	
	@Before
	public void setUp()
	{
		employeeOne = new EmployeeDetails(101);
		employeeOne.setMonthlyBasic(20000);
	}
	
	@Test
	public void annualBasicTest() {
		assertEquals(0,employeeOne.getAnnualBasic(),0);
	}

}
