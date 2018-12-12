
public class SearchInMultiDimentionalArray {

	public boolean elementSearch(int[][] inputArray, int elementToSearch) 
	{
		for (int[] row : inputArray)
		{
			if (row != null)
				for (int column : row)
					if(column == elementToSearch)
						return true;

		}
		return false;
	}

}
