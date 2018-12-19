import static org.junit.Assert.*;

import org.junit.Test;


public class PersonTest {

	@Test
	public void personDetailsTest() {
		Person personOne = new Person("Shyam",27,2,2000);
		assertEquals("Details of person-> name: Shyam Date of birth: 2000/2/27 age: 18 years 9 months 22 days",personOne.toString());
	}

	
	@Test										//persons with different year of birth and month
	public void ageDifferenceTestWithSDifferentYear() {
		Person personOne = new Person("Shyam",27,2,2000);
		Person personTwo = new Person("Ram",12,12,1997);
		assertEquals("Shyam is older than Ram by 2 years, 2 months,15 days",personOne.olderOne(personTwo));
	}
	

	@Test										//persons with same birth year and different birth month
	public void ageDifferenceTestWithSameYearDifferentMonth() {
		Person personOne = new Person("Shyam",27,2,2000);
		Person personTwo = new Person("Ram",12,12,2000);
		assertEquals("Shyam is older than Ram by 0 years, 9 months,15 days",personOne.olderOne(personTwo));
	}
	
	
	@Test										//persons with same month and same year
	public void ageDifferenceTestWithSameYearAndMonth() {
		Person personOne = new Person("Shyam",27,2,2000);
		Person personTwo = new Person("Ram",12,2,2000);
		assertEquals("Shyam is older than Ram by 0 years, 0 months,15 days",personOne.olderOne(personTwo));
	}
	

	@Test										//persons with same age
	public void ageDifferenceTestWithSameAge() {
		Person personOne = new Person("Shyam",2,2,2000);
		Person personTwo = new Person("Ram",2,2,2000);
		assertEquals("Both Shyam and Ram are of same age",personOne.olderOne(personTwo));
	}
}
