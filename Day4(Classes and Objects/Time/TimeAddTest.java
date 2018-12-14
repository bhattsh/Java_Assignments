import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TimeAddTest {

	private Time timeOne;
	private Time timeTwo;
	private Time timeThree;
	
	@Before
	public void setUp()
	{
		timeOne = new Time();
		timeTwo = new Time();
		timeThree = new Time();
		
	}
	@Test
	public void sumOfAccurateTimeTest() {
		timeOne.setTime(23,45);
		timeTwo.setTime(23,40);
		timeThree.timeSum(timeOne,timeTwo);
		assertEquals(23,timeThree.getHours());
		
	}

	@Test
	public void sumOfTimeForInaccurateHourTest() {
		timeOne.setTime(25,45);
		timeTwo.setTime(23,40);
		timeThree.timeSum(timeOne,timeTwo);
		assertEquals(-1,timeThree.getHours());
		
	}

	
	@Test
	public void sumOfTimeForInaccurateMinuteTest() {
		timeOne.setTime(25,62);
		timeTwo.setTime(23,40);
		timeThree.timeSum(timeOne,timeTwo);
		
		assertEquals(-1,timeThree.getMinutes());
	}
}
