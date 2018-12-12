import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestToFindMissingElements {

	private FindMissingElements find;
	
	@Before
	public void setUp()
	{
		find = new FindMissingElements();
	}
	
	@Test
	public void foundsMissingElementsTest() {
		int elements[] = {1,3,8,6,10,9,2,4,5};
		assertEquals(7,find.findMissingElements(elements));
	}
	
	@Test
	public void NosMissingElementsTest() {
		int elements[] = {7,3,8,6,10,9,2,4,5};
		assertEquals(0,find.findMissingElements(elements));
	}



}
