import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MultiplicationTest {

	private Multiplication multiply;
	private int expectedResult;
	private int input1;
	private int input2;
	
	public MultiplicationTest(int input1, int input2, int expectedResult)
	{
		super();
		this.input1 = input1;
		this.input2 = input2;
		this.expectedResult = expectedResult;
	}
	
	@Before
	public void setUp()
	{
		multiply = new Multiplication();
	}
	
	
	@Parameters
	public static List<Object []> parametersForMultiplicationTest()    //public static Collection will also word 
	{
		
		return Arrays.asList(new Object[][]{
				{2,4,8},
				{5,-5,-25},
				{0,2,0}
		});
	}
	
	
	
	
	//this test wil run 3 times as we have defined 3 parameters
	@Test
	public void testMultiplication()
	{
		assertEquals(expectedResult, multiply.multiplication(input1,input2));
	}
}
