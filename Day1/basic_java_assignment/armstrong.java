package basics;
public class Armstrong {

	public static void main(String[] args)
	{
		System.out.println("hello");
		
		int i;
		int armNumber;
		for(i=100;i<1000;i++)
		{
			int no = i;
			armNumber = 0;
			
			while(no != 0){ 
			int remainder = no%10;
			armNumber = armNumber + remainder*remainder*remainder;
			no = no/10;
			}
			
			if(i == armNumber)
				System.out.println(i +" is a armstrong number");
		}
		
	}
}
