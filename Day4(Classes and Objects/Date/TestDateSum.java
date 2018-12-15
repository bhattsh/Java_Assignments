import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestDateSum {

	private Date dateOne;
	private Date dateTwo;
	
	
	@Test
	public void yearOfDateToCompareIsSmaller() {
		
		dateOne = new Date(12,10,2006);
		dateTwo = new Date(11,12,2007);
		assertEquals(true,dateOne.isSmaller(dateTwo));
	}

	@Test
	public void yearOfDateToCompareIsLqarger() {
		
		dateOne = new Date(12,12,2007);
		dateTwo = new Date(11,12,2007);
		assertEquals(false,dateOne.isSmaller(dateTwo));
	}
	
	@Test
	public void monthOfDateToCompareIsLqargerWithSmallerYear() {
		
		dateOne = new Date(1,12,2005);
		dateTwo = new Date(11,11,2007);
		assertEquals(true,dateOne.isSmaller(dateTwo));
	}
	
	@Test
	public void monthOfDateToCompareIsSmallerWithSmallerYear() {
		
		dateOne = new Date(1,12,2005);
		dateTwo = new Date(11,11,2007);
		assertEquals(true,dateOne.isSmaller(dateTwo));
	}
	
	@Test
	public void monthOfDateToCompareIsSmallerWithSameYearAndSmallerMonth() {
		
		dateOne = new Date(1,06,2007);
		dateTwo = new Date(11,11,2007);
		assertEquals(true,dateOne.isSmaller(dateTwo));
	}
	
	@Test
	public void monthOfDateToCompareIsSmallerWithSameYearAndLargerMonth() {
		
		dateOne = new Date(1,06,2007);
		dateTwo = new Date(11,04,2007);
		assertEquals(false,dateOne.isSmaller(dateTwo));
	}
	
	@Test
	public void dayOfDateToCompareIsSmallerWithSameYearAndSameMonth() {
		
		dateOne = new Date(1,04,2007);
		dateTwo = new Date(5,04,2007);
		assertEquals(true,dateOne.isSmaller(dateTwo));
	}
	
	@Test
	public void dayOfDateToCompareIsLargerWithSameYearAndSameMonth() {
		
		dateOne = new Date(17,04,2007);
		dateTwo = new Date(5,04,2007);
		assertEquals(false,dateOne.isSmaller(dateTwo));
	}
}
