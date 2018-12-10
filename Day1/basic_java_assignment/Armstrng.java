package basics;

public class Armstrng {
	
	public static void main(String[] args)
	{
		
		int i;
		int armNumber =153;
		int result =0;
		int	no = armNumber;
			while(armNumber != 0){ 
			int remainder = armNumber%10;
			result = result + remainder*remainder*remainder;
			armNumber = armNumber/10;
			}
			
			if(result == no)
				System.out.println(no +" is a armstrong number");
		
	}

}
