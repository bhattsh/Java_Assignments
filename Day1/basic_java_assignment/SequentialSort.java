package basics;
import java.util.Scanner;
public class SequentialSort {
	int sort[] = new int[15];
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		 for(int i=0;i<15;i++)
		{
		System.out.println("enter "+ (i+1) + " number");
		sort[i]=sc.nextInt();
		}
	}
	
	int[] sortArray()
	{
		for(int i=0;i<sort.length;i++)
		{
			for(int j=i+1;j<sort.length;j++)
			{
				if(sort[i]>sort[j])
				{
					int temp = sort[i];
					sort[i] = sort[j];
					sort[j] = temp;
				}
			}
		}
		return sort;
	}

	public static void main(String []args) 
	{
	 SequentialSort seq = new SequentialSort();
	 System.out.println("enter 15 numbers");
	 seq.input();
	 int sortedArray[] = seq.sortArray();
	 
	 for(int i=0;i<sortedArray.length;i++)
		 System.out.print(" "+sortedArray[i]);
	}
}
