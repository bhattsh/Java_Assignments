package training;

/**
 * 
 * @author Shubham Bhatt
 *CorporateTraining class is a subclass of Training class with one parameterized constructor and one overriding method getOrderValues
 */
public class CorporateTraining extends Training {
	
	private int days;
	
	/**
	 *Parameterized constructor to initialize one field days and passes other parameters to super class constructor
	 * @param courseName
	 * @param fees
	 * @param days
	 */
	public CorporateTraining(String courseName, int fees, int days)
	{
		super(courseName, fees);
		this.days = days;
	}

	
	/**
	 * abstract method from parent class Training which returns specific course cost
	 */
	@Override
	public double getOrderValues() {
		return this.days*super.getFees();
	}

}
