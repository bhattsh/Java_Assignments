import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SumOfTwoDistanceTest {

	private Distance distanceOne;
	private Distance distanceTwo;
	private Distance distanceThree;

	@Before
	public void setUp()
	{
		distanceOne = new Distance();
		distanceTwo = new Distance();
		distanceThree = new Distance();
	}
	
	@Test
	public void sumOfDistancesWhenTotalInchesAreLessThanTwelve() 
	{
		distanceOne.set(5,9);
		distanceTwo.set(6,2);
		distanceThree.distanceSum(distanceOne, distanceTwo);
		
		assertEquals(11,distanceThree.getFeet());
		//assertEquals(11,distanceThree.getInches(),0);
	}

	@Test
	public void sumOfDistancesWhenTotalIncheAreEqualToTwelve() 
	{
		distanceOne.set(5,9);
		distanceTwo.set(6,3);
		distanceThree.distanceSum(distanceOne, distanceTwo);
		
		assertEquals(11,distanceThree.getFeet());
		//assertEquals(12,distanceThree.getInches(),0);
	}
	
	
	@Test
	public void sumOfDistancesWhenTotalInchesAreGreaterThanTwelve() 
	{
		distanceOne.set(5,9);
		distanceTwo.set(6,11);
		distanceThree.distanceSum(distanceOne, distanceTwo);
		
		assertEquals(12,distanceThree.getFeet());
		//assertEquals(8,distanceThree.getInches(),0);
	}
}
