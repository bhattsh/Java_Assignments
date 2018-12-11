/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
*/

import java.util.Scanner;
class Palindrome
{
	public static void main(String []args)
	{
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		char numberArray[] = number.toCharArray();	
		String reverse = "";
		for(int i=numberArray.length-1; i>-1; i--)
		{
			reverse = reverse + numberArray[i]; 
			
		}

		if(number.equals(reverse))
			System.out.println(number + " is a palindrome number");
		else
			System.out.println(number + " is not a palindrome number");
	}

}