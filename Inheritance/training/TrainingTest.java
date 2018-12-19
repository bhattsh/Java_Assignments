package training;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author Shuabham Bhatt
 *TriningTest class is a JUnit class for testing different test cases for different types of training
 */
public class TrainingTest {
	private static Logger log = Logger.getLogger(TrainingTest.class);
	
	private Training publicTraining;
	
	/**
	 * Test to calculate trainingCost of public training using parent reference
	 */
	@Test
	public void testTotalCostOfPublicTrainingWithParentReference() {
	     BasicConfigurator.configure();
		log.debug("Log4j debug message test.");
		log.info("Log4j info message test.");
		publicTraining = new PublicTraining("Java",5000,50);            //Upcasting
		assertEquals(250000,publicTraining.getOrderValues(),0);
	}

	
	/**
	 * Test to calculate trainingCost of corporate training using parent reference
	 */
	@Test
	public void testTotalCostOfCorporateTrainingWithParentReference() {
		CorporateTraining corporateTraining = new CorporateTraining("Big Data",35000,4);    //Upcasting
		assertEquals(140000,corporateTraining.getOrderValues(),0);
	}
	
	
	/**
	 * Test to calculate trainingCost of public training using child class reference i.e. using the same class object in which
	 * function to calculate cost of public training is defined
	 */
	@Test
	public void testTotalCostOfPublicTrainingWithOwnReference() {
		publicTraining = new PublicTraining("Java",5000,50);
		assertEquals(250000,publicTraining.getOrderValues(),0);
	}

	
	/**
	 * Test to calculate trainingCost of corporate training using child class reference i.e. using the same class object in which
	 * function to calculate cost of corporate training is defined
	 */
	@Test
	public void testTotalCostOfCorporateTrainingWithOwnReference() {
	CorporateTraining	corporateTraining = new CorporateTraining("Java",5000,60);
		assertEquals(300000,corporateTraining.getOrderValues(),0);
	}
}
