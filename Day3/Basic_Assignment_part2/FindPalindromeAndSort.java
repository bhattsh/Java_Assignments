/*
  	Take 10 inputs
	Identify a Palindrome
	Count the chars in it
	And sort in descending order of chars

 */

public class FindPalindromeAndSort {

	public String[] palindromeOrNot(String []input)
	{
		String []palindromes;
		int countPalindromes = 0;
		String addAllPalindromes="";
		int numberOfCharactersInPalindrome[];
		
		//Below code will find out all palindrome strings and add them in a single string variable addAllPalindromes
		for(int counter=0;counter<input.length;counter++)  
		{
			String stringFromInputStringArray = input[counter];
			
			char stringToCharArray[] = stringFromInputStringArray.toCharArray();
			String reverseLetter ="";
			
			for(int countChars =stringToCharArray.length-1; countChars>=0; countChars--)
			{
				reverseLetter = reverseLetter + stringToCharArray[countChars];
			}
			
			if(reverseLetter.equals(stringFromInputStringArray))
			{
				
				addAllPalindromes += reverseLetter + " "; 
				countPalindromes++;
			}	
		}
		
		palindromes = new String[countPalindromes];
		numberOfCharactersInPalindrome = new int[countPalindromes];
		String palindromeString[] = addAllPalindromes.split(" ");
		for(int count=0;count<countPalindromes;count++)
		{
			palindromes[count] = palindromeString[count];
			
			numberOfCharactersInPalindrome[count] = palindromes[count].length();  //palindrome length will be stored in a array
			
		}
		
		for(int count=0; count<countPalindromes; count++)
			System.out.println(palindromes[count] + " is a palindrome string and length is "+numberOfCharactersInPalindrome[count]);
		
		for(int count=0;count<palindromes.length-1;count++)
		{
			for(int innerCounter = count+1; innerCounter<palindromes.length-1; innerCounter++)
			{
				if(palindromes[count].compareTo(palindromes[innerCounter]) >0)
				{
					String temp = palindromes[count];
					palindromes[count] = palindromes[innerCounter];
					palindromes[innerCounter] = temp;
				}
				else
				{
				String temp = palindromes[innerCounter];
				palindromes[innerCounter] = palindromes[count];
				palindromes[count] = temp;
				}
			}
		}
		
		for(int count=0; count<countPalindromes; count++)
			System.out.println(palindromes[count] + " is a palindrome string and length is "+numberOfCharactersInPalindrome[count]);
		
		
		return palindromes;
		
	}
}
