import static org.junit.Assert.*;

import org.junit.Test;


public class Palindrome {

	private FindPalindromeAndSort object = new FindPalindromeAndSort();
	@Test
	public void palindromeFound()
	{
		String arrayOfStrings[] ={"shubham","nitin","tejas","mam","rohan","tushar","pranjal","prateek","pawan","zaffar"};
		String palindromeStrings[] = {"nitin","mam"};
		
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
