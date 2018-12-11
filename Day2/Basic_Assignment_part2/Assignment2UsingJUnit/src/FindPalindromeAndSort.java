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
		
		for(int counter=0;counter<input.length;counter++)
		{
			String stringFromInputStringArray = input[counter];
			
			char stringToCharArray[] = stringFromInputStringArray.toCharArray();
			String reverseLetter ="";
			
			System.out.println(reverseLetter);
			
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
		String palindromeString[] = addAllPalindromes.split(" ");
		for(int count=0;count<countPalindromes;count++)
		{
			palindromes[count] = palindromeString[count];
		}
		
		for(int i=0; i<countPalindromes;i++)
			System.out.println(palindromes[i]);
		return palindromes;
		
	}
}
