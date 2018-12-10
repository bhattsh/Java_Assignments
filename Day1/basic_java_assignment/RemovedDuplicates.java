package basics;

import java.util.Scanner;

public class RemovedDuplicates {
	int arrayWithDuplicates[];
	int arrayWithNoDuplicates[];
	int n;	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements you wants to insert ");
		n = sc.nextInt();
		arrayWithDuplicates = new int[n];
		 for(int i=0;i<n;i++)
		{
		System.out.println("enter "+ (i+1) + " number");
		arrayWithDuplicates[i]=sc.nextInt();
		}
	}
	
	
	int[] removeDuplicates()
	{ 
		arrayWithNoDuplicates = new int[n];
		arrayWithNoDuplicates[0] = arrayWithDuplicates[0]; 
		int found;
		for(int i=1;i<n;i++)
		{
			found=0;
			for(int j=0;j<i;j++)
			{
				if(arrayWithNoDuplicates[j] == arrayWithDuplicates[i])
					found=1;
						
			}
			
			if(found == 0)
				arrayWithNoDuplicates[i] = arrayWithDuplicates[i]; 
		}
		return arrayWithNoDuplicates;
		
	}	
	
	public static void main(String []args) 
	{
	 RemovedDuplicates rm = new RemovedDuplicates();
	 System.out.println("enter 15 numbers");
	 rm.input();
	 int arrayWithoutDuplicates[] =rm.removeDuplicates();
	 
	 for(int i=0;i<arrayWithoutDuplicates.length;i++)
		 System.out.print(" "+arrayWithoutDuplicates[i]);
	}
}
