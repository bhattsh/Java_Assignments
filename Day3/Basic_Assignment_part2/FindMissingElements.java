
public class FindMissingElements {

	public int findMissingElements(int[] inputArray) {
		

		for(int count =0; count<inputArray.length; count++)
		{
	
			for(int innerCount = count+1; innerCount<inputArray.length; innerCount++)
			{
				if(inputArray[innerCount] < inputArray[count])
				{
					int temp = inputArray[count];
					inputArray[count] = inputArray[innerCount];
					inputArray[innerCount] = temp;
				}
			}
			
		}	
		
		for(int counter =0; counter<inputArray.length-1; counter++)  //this loop will not consider last element
		{
			System.out.println(inputArray[counter]);
					if(inputArray[counter]+1 != inputArray[counter+1])
					return ++inputArray[counter];
		}

		return 0;
	}

}
