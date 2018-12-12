
public class DifferenceBetweenTwoArrayElements {

	public boolean checkDifference(int[] inputElements, int allowedDifferenceBetweenIndex) 
	{
		for(int outerLoopCounter=0;outerLoopCounter<inputElements.length;outerLoopCounter++)
		{
			for(int innerLoopCounter = outerLoopCounter+1; innerLoopCounter<inputElements.length; innerLoopCounter++)
			{
				if(innerLoopCounter-outerLoopCounter > allowedDifferenceBetweenIndex)
					break;
				else
				{
					if(inputElements[innerLoopCounter] == inputElements[outerLoopCounter])
					{
						return true;
					}
				}
			}
		}
		return false;
	}

}
