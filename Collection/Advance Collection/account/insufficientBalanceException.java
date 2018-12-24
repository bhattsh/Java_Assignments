package account;

/**
 * 
 * @author Shubham Bhatt Exception class
 */
public class insufficientBalanceException extends Exception {

	/**
	 * Parameterized constructor
	 * 
	 * @param message
	 */
	public insufficientBalanceException(String message) {
		super(message);
	}

}
