package training;

/**
 * 
 * @author Shubham Bhatt
 * PublicTraining is a subclass of Training class with one field participants and one method getOrderValues
 *
 */
public class PublicTraining extends Training{

	private int participants;

	/**
	 * Parameterized constructor
	 * @param subjectName
	 * @param fees
	 * @param numberOfParticipants
	 */
	public PublicTraining(String subjectName, int fees,int numberOfParticipants)
	{
		super(subjectName, fees);
		this.participants = numberOfParticipants;
	}

	
	/**
	 *abstract method from super class Training which returns the cost of corporate training 
	 */
	public double getOrderValues()
	{
		return super.getFees()*this.participants;
	}
}
