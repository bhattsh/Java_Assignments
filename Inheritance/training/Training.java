package training;

/**
 * 
 * @author Shubham Bhatt Training class is an abstract superclass with fields
 *         id,fees,courseName,nextId and an abstract method getOrderValues
 */
public abstract class Training {

	private int id;
	private int fees;
	private String courseName;
	private static int nextId = 1;

	
	/**
	 * Parameterized constructor with parameters :
	 * 
	 * @param courseName
	 * @param fees
	 * 
	 */
	public Training(String courseName, int fees) {
		this.id = nextId++;
		this.courseName = courseName;
		this.fees = fees;
	}

	
	/**
	 * Getter method return fee of respective course
	 * 
	 * @return
	 */
	public int getFees() {
		return fees;
	}

	/**
	 * 
	 * Abstract method which will calculate total course cost based on the type of course
	 */
	public abstract double getOrderValues();

}
