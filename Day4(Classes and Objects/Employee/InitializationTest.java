import static org.junit.Assert.*;

import org.hamcrest.core.IsNull;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.*;

public class InitializationTest {

	private EmployeeDetails employeeOne;
	private EmployeeDetails employeeTwo;
	
	@Before
	@Category(Initialized.class)
	public void setUp()
	{
		employeeOne = new EmployeeDetails(101);
		employeeTwo = new EmployeeDetails(102);
		

		employeeOne.setName("Shubham");
		employeeOne.setMonthlyBasic(20000.0);
	}
	
	@Test
	public void isInitialized()
	{	
		assertThat("Shubham",is(employeeOne.getName()));
	}

}
