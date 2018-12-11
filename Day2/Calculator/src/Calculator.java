
public class Calculator {
	private int firstNumber;
	private int secondNumber;
	
	public int addition(int i, int j) {
		return i+j;
	}
	
	public int subtraction(int i, int j) {
		return i-j;
	}
	
	public double division(double i, double j) throws InvalidDivisionException 
	{
		if(j == 0)
			throw new InvalidDivisionException();
		else
		{
			System.out.println("division is: "+i/j);
			return i/j;
		}
			
	}
	
	
}
