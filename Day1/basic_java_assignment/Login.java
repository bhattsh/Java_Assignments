package basics;
import java.util.Scanner;
public class Login {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i=3;
		while(i>0)
		{
		System.out.println("enter your UserName: ");
		String userName = sc.next();
		System.out.println("enter your password: ");
		String password = sc.next();
		
		if(userName.equals("shubham") && password.equals("shubham123"))
		{
			System.out.println("welcome "+userName);
			System.exit(0);
		}
		else
		{
			i--;
			if(i != 0)
				System.out.println("authentication failed. Wrong userName or password. Attempts remaining "+i);

			else 
				System.out.println("Contact Admin");
		}
	}
}
}
