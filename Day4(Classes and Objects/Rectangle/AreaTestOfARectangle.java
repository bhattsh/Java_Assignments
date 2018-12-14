import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;


public class AreaTestOfARectangle {

	private Rectangle rectangleOne;
	private Rectangle rectangleTwo;
	private Rectangle rectangleThree;
	private Rectangle rectangleFour;
	@Before
	public void setUp()
	{
		 rectangleOne = new Rectangle(10,5);
		 rectangleTwo = new Rectangle(-5,-10);
		 rectangleThree = new Rectangle(-10,20);
		 rectangleFour = new Rectangle(10,10);
	}
	
	@Test
	public void testAreaWithPositiveLengthAndBreadth() {
		 
		assertEquals(50,rectangleOne.area(),0);
	}

	@Test
	public void testAreaWithNegativeLengthAndBreadth() {
		assertEquals(50,rectangleTwo.area(),0);
	}
	

	@Test
	public void testAreaWithOneNegativeAmongLengthAndBreadth() {
		assertEquals(0,rectangleThree.area(),0);
	}
	
	@Test
	public void testAreaOfTwoRectangle() {
		
		assertThat(false,is(rectangleOne.areaIsEqualOrnot(rectangleFour)));
	}
}
