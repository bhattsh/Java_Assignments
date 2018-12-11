import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AdditionTest {

	private Calculator addition;
	
	@Before
	public void setUp()
	{
		addition = new Calculator();
	}

	@Test
	public void additionOfTwoPositive()
	{
		assertEquals("addition ",100,addition.addition(50,50));
	}
	
	@Test
	public void additionOfTwoNegative()
	{
		assertEquals("addition ",-60,addition.addition(-50,-10));
	}
	
	@Test
	public void additionOfTwoZeros()
	{
		assertEquals("addition ",0,addition.addition(0,0));
	}
	
	@Test
	public void additionOfOneZeroAndPositive()
	{
		assertEquals("addition ",40,addition.addition(0,40));
	}

	@Test
	public void additionOfOneZeroAndNegative()
	{
		assertEquals("addition ",-10,addition.addition(0,-10));
	}
	
	@Test
	public void additionOfOnePositiveAndOneNegative()
	{
		assertEquals("addition ",10,addition.addition(20,-10));
	}
}
