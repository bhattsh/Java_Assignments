import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class findStringTest {

	private FindAndCountAString search;
	
	@Before
	public void setUp()
	{
		search = new FindAndCountAString();
	}
	

	@Test
	public void stringFoundTest() {
		String inputString [] = {"Johnson", "Bill", "Williams", "Jones", "Moore", "Davis", "Moore", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson" };
		assertEquals(3,search.searchAndCountAString(inputString,"Moore"));
	}

	@Test
	public void stringFoundOnlyOnceTest() {
		String inputString [] = {"Johnson", "Bill", "Williams", "Jones", "Moore", "Davis", "Moore", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson" };
		assertEquals(1,search.searchAndCountAString(inputString,"Jones"));
	}
	
	@Test
	public void stringNotFoundTest() {
		String inputString [] = {"Johnson", "Bill", "Williams", "Jones", "Moore", "Davis", "Moore", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson" };
		assertEquals(0,search.searchAndCountAString(inputString,"Jonny"));
	}
}
