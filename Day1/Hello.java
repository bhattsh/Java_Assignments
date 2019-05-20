public class Hello
{
	static int add(int numOne, int numTwo)
	{
		return (numOne+numTwo);
	}

	static int sub(int numOne, int numTwo)
	{
		return (numTwo-numOne);
	}

	static int mul(int numOne, int numTwo)
	{
		return(numOne*numTwo);
	}

	static int div(int numOne, int numTwo)
	{
		return(numTwo/numOne);
	}

	public static void main(String[] args)
	{
		int firstNumber = 10;
		int secondNumber = 20;

		System.out.println("additon "+ add(firstNumber, secondNumber));
		System.out.println("subtraction "+ sub(firstNumber,secondNumber));
		System.out.println("multiplication "+ mul(firstNumber,secondNumber));
		System.out.println("division "+ div(firstNumber,secondNumber));
	}

}
