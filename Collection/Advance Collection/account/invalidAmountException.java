package account;
/**
 * 
 * @author Shubham Bhatt
 *Exception class
 */
public class invalidAmountException extends Exception
{
	/**
	 * Parameterized constructor 
	 * @param message
	 */
	public invalidAmountException(String message)
	{
		super(message);
	}
	
}
