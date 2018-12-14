import static org.junit.Assert.*;


import org.junit.Test;


public class PerimeterTestOfArectangle {

	
	@Test
	public void testPerimeterWithPositiveLengthAndBreadth() {
		Rectangle perimeter = new Rectangle(10,5);
		assertEquals(30,perimeter.perimeter(),0);
	}

	@Test
	public void testPerimeterWithNegativeLengthAndBreadth() {
		Rectangle perimeter = new Rectangle(-10,-5);
		assertEquals(0,perimeter.perimeter(),0);
	}
	
	@Test
	public void testPerimeterWithOneNegativeAmongLengthAndBreadth() {
		Rectangle perimeter = new Rectangle(-10,-5);
		assertEquals(0,perimeter.perimeter(),0);
	}
}
