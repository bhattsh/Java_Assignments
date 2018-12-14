import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SumOfTwoComplexNumberTest {

	private Complex numberOne;
	private Complex numberTwo;
	private Complex numberThree;
	
	@Before
	public void setUp() 
	{
	 numberOne= new Complex();
	numberTwo = new Complex();
	numberThree = new Complex();
	

	}

	@Test
	public void testRealValueAfterSumOfTwoComplexNumber()   // this test checks real part of a complex number after adding two positive complex number
	{
		numberOne.set(10f,20f);
		numberTwo.set(5f, 5f);
		numberThree.sumOfComplexNumbeer(numberOne, numberTwo);
		
		assertEquals(15,numberThree.getReal(),0);
		
	}
	
	@Test																// this test checks imagenary part of a complex number after adding two negative complex number
	public void testImagenaryValueAfterSumOfTwoComplexNumber()
	{
		numberOne.set(10f,20f);
		numberTwo.set(5f, 5f);
		numberThree.sumOfComplexNumbeer(numberOne, numberTwo);
		
		assertEquals(25,numberThree.getImagenary(),0);
	}
	
	
	
	@Test															// this test checks real part of a complex number after adding two complex number with negative real in both complex numbers
	public void testRealValueAfterSumOfTwoNegativeRealPart()      
	{
		numberOne.set(-10f,20f);
		numberTwo.set(-5f, 5f);
		numberThree.sumOfComplexNumbeer(numberOne, numberTwo);
		
		assertEquals(-15,numberThree.getReal(),0);
		
	}
	
	@Test															// this test checks imagenary part of a complex number after adding two complex number with negative imagenary part in both complex number
	public void testImagenaryValueAfterSumOfTwoNegativeImagenaryPart()
	{
		numberOne.set(10f,-20f);
		numberTwo.set(5f, -5f);
		numberThree.sumOfComplexNumbeer(numberOne, numberTwo);
		
		assertEquals(-25,numberThree.getImagenary(),0);
	}


	
}
