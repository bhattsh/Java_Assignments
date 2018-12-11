import java.util.Scanner;

class ReverseWords
{
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter the string you want to reverse");
		String inputString = input.nextLine();
		String inputStringArray[] = inputString.split(" ");
	
		System.out.println(inputStringArray.length);
	for(String word : inputStringArray) 
	{
                System.out.println(word);
	}

	}

}