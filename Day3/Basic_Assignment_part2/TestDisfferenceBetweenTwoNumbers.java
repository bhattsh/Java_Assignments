import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestDisfferenceBetweenTwoNumbers {

	private DifferenceBetweenTwoArrayElements difference;
	@Before
	public void setUp()
	{
		difference = new DifferenceBetweenTwoArrayElements();
	}
	
	@Test
	public void elementDistanceIsInRange() {
		int arrayOfStrings[] ={1000,101,55,100,101,532,200,120};
		
		assertEquals(true, difference.checkDifference(arrayOfStrings,3));
	}

	@Test
	public void noneElementDistanceIsInRange() {
		int arrayOfStrings[] ={1000,101,55,100,102,532,200,120};
		
		assertEquals(false, difference.checkDifference(arrayOfStrings,3));
	}
	
}
