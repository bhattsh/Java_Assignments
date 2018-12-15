import static org.junit.Assert.*;

import org.junit.Test;


public class TestDateDifference {

	private Date dateOne;
	private Date dateTwo;
	
	@Test
	public void differenceInTwoDateTestWhenFirstDateIsGreater() {
		
		dateOne = new Date(12,10,2018);
		dateTwo = new Date(11,12,2007);
		int dateDifference[] = dateOne.difference(dateTwo);
		assertEquals(1, dateDifference[0]);                  //difference of days
	//	assertEquals(2, dateDifference[1]); 				//difference of months
	//	assertEquals(11, dateDifference[2]); 				//difference of years
	}

	@Test
	public void differenceInTwoDateTestWhenFirstDateIsSmaller() {
		
		dateOne = new Date(10,10,2018);
		dateTwo = new Date(11,12,2007);
		int dateDifference[] = dateOne.difference(dateTwo);
		assertEquals(1, dateDifference[0]);                  //difference of days
	//	assertEquals(2, dateDifference[1]); 				//difference of months
	//	assertEquals(11, dateDifference[2]); 				//difference of years
	}
}
