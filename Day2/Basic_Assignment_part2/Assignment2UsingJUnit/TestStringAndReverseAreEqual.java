import static org.junit.Assert.*;

import org.junit.Test;


public class TestStringAndReverseAreEqual {

	@Test
	public void stringAndItsReverseEqual()
	{
		ReverseString reverse = new ReverseString();
		assertEquals("string ","tI strats htiw eno gniht",reverse.stringReverse("It starts with one thing"));
	}

}
