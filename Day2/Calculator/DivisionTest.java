import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class DivisionTest {

	private Calculator divide;
	
	@Before
	public void setUp()
	{
		divide = new Calculator();
	}
	
	
//this Test case will get executed successfully if there will be an exception of dividing number by zero
	@Test(expected = InvalidDivisionException.class)
	public void divideANumberByZero() throws InvalidDivisionException
	{
		divide.division(10,0);
	}

	//this Test case will not get executed successfully if there is an exception of dividing number by zero	
	@Test
	public void divideLargeBySmall() throws InvalidDivisionException 
	{
		assertEquals("division ",2,divide.division(10,5),0);
	}
	
	@Test
	public void divideSmallByLarge() throws InvalidDivisionException 
	{
		assertEquals("division ",0.5,divide.division(5,10),0);  //here 0 is delta value 
		
	}
}
