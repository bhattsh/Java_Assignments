
public class ReverseString {

	public String stringReverse(String stringToReverse) 
	{
		String reversedString="";
		String stringArray[] = stringToReverse.split(" ");
		
		for(int outerLoopCounter=0; outerLoopCounter<stringArray.length; outerLoopCounter++)
		{
			char wordArray[] = stringArray[outerLoopCounter].toCharArray();
			
			for(int count = wordArray.length-1; count>=0; count--)
			{
				reversedString = reversedString + wordArray[count];
			}
			
			if(outerLoopCounter != stringArray.length-1)             //
			reversedString += " ";
		}
		System.out.println(reversedString);
		return reversedString;
	}

}
