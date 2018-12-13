import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SubtractionTest {

	private Calculator subtract;
	
	@Before
	public void setUp()
	{
		subtract = new Calculator();
	}
	
	@Test
	public void subtractSmallFromLarge() {
		assertEquals("subtraction ",10,subtract.subtraction(20,10));
	}
	
	@Test
	public void subtractLargeFromSmall() {
		assertEquals("subtraction ",-10,subtract.subtraction(10,20));
	}
	
	@Test
	public void subtractNegatives() {
		assertEquals("subtraction ",-10,subtract.subtraction(-20,-10));
	}
	
	@Test
	public void subtractZeros() {
		assertEquals("subtraction ",0,subtract.subtraction(0,0));
	}
	
	@Test
	public void subtractZeroAndPositive() {
		assertEquals("subtraction ",-10,subtract.subtraction(0,10));
	}
	
	@Test
	public void subtractZeroAndNegative() {
		assertEquals("subtraction ",10,subtract.subtraction(0,-10));
	}
	

	@Test
	public void subtractNegativeAndZero() {
		assertEquals("subtraction ",-10,subtract.subtraction(-10,0));
	}
	
	@Test
	public void subtractPositiveAndZero() {
		assertEquals("subtraction ",10,subtract.subtraction(10,0));
	}
	

}
