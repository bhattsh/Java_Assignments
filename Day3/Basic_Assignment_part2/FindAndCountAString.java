
public class FindAndCountAString {

	public int searchAndCountAString(String[] inputString, String stringToSearch) 
	{
		int numberOfTimesStringFound=0;
		for(int count=0; count<inputString.length; count++)
		{
			if(inputString[count].equals(stringToSearch))
				numberOfTimesStringFound++;
		}
		return numberOfTimesStringFound;
	}

}
