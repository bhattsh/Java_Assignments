package basics;
import java.util.Scanner;
public class LinearSearch {
	int arrayToSearch[];
	Scanner sc = new Scanner(System.in);
	int numberToSearch,n;
	void input()
	{
		 System.out.println("enter the size of array");
		 n = sc.nextInt();
		 arrayToSearch = new int[n];
		 for(int i=0;i<n;i++)
		{
		System.out.println("enter "+ (i+1) + " number");
		arrayToSearch[i]=sc.nextInt();
		}
		 System.out.println("enter the number to search :");
		  numberToSearch = sc.nextInt();
	}
	
	boolean searchArray()
	{
		for(int i=0;i<arrayToSearch.length;i++)
		{
			if(numberToSearch == arrayToSearch[i])
				return true;
		}
		return false;
		
	}

	public static void main(String []args) 
	{
	 LinearSearch ls = new LinearSearch();
	 ls.input();
	 
	
	
	 
	 boolean numberFound =ls.searchArray();
	 if(numberFound == true)
		 System.out.println("number found");
	 else
		 System.out.println("number not found");
}
}
