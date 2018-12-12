import static org.junit.Assert.*;

import org.junit.Test;


public class PalindromeTest {

	private FindPalindromeAndSort object = new FindPalindromeAndSort();
	@Test
	public void palindromeFound()
	{
		String arrayOfStrings[] ={"shubham","NitiN","nitin","mam","tejas","NitiN","rohan","tushar","pranjal","prateek","pawan","zaffar"};
		String palindromeStrings[] = {"mam","nitin","NitiN","NitiN"};
		
		assertArrayEquals(palindromeStrings, object.palindromeOrNot(arrayOfStrings));
	}
	
	@Test
	public void palindromeNotFound()
	{
		String arrayOfStrings[] ={"shubham","nitinam","tejas","mama","rohan","tushar","pranjal","prateek","pawan","zaffar"};
		String palindromeStrings[] = {};
		
		assertArrayEquals(palindromeStrings, object.palindromeOrNot(arrayOfStrings));
	}

}


