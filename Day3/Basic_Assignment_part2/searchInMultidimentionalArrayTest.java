import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class searchInMultidimentionalArrayTest {

	private SearchInMultiDimentionalArray search;
	
	@Before
	public void setUp()
	{
		search = new SearchInMultiDimentionalArray();
	}
	
	@Test
	public void elementFoundTest() {
	int inputArray[][] = {{1,2,3},{4,5,6},{7,8,9}};
	assertEquals(true,search.elementSearch(inputArray,8));
	}

	@Test
	public void elementNotFoundTest() {
	int inputArray[][] = {{1,2,3},{4,5,6},{7,8,9}};
	assertEquals(false,search.elementSearch(inputArray,10));
	}
}
