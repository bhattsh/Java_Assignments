import static org.junit.Assert.*;

import javax.management.modelmbean.RequiredModelMBean;

import org.junit.Test;


public class TriangleTest {

	private Triangle rightTriangle = new Triangle(5,3,4);
	private Triangle equilateralTriangle = new Triangle(3,3,3);
	private Triangle isoscelesTriangle = new Triangle(5,5,4);
	private Triangle scaleneTriangle = new Triangle(5,3,4);
	@Test
	public void rightTriangleTest() {									//right triangle or not
	
		assertEquals(true,rightTriangle.isRightTriangle());
	}

	@Test																//equilateral triangle or not
	public void equilateralTriangleTest() {
	
		assertEquals(true,equilateralTriangle.isEquilateral());
	}

	@Test
	public void isoscelesTriangleTest() {								//isosceles triangle or not
	
		assertEquals(true,isoscelesTriangle.isIsosceles());
	}

	@Test															//scalene triangle or not
	public void scaleneTriangleTest() {
	
		assertEquals(true,scaleneTriangle.isScalene());
	}

	@Test															//equilateral triangle is not a scalene triangle or not
	public void equilateralIsAScaleneTriangleTest() {
	
		assertEquals(false, equilateralTriangle.isScalene());		
	}
	
	@Test															//isosceles triangle is not a scalene triangle or not
	public void isoscelesIsAScaleneTriangleTest() {
	
		assertEquals(false, equilateralTriangle.isScalene());		
	}
	
}
