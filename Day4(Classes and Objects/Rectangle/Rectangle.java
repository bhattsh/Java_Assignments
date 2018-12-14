/*
 PROBLEM : 
 
Consider a Rectangle Shape.
Identify its properties and behaviours and implement the same.
Write a Test Cases to check if the behaviours(methods) are implemented properly.
If their are 2 Rectangle objects of different sizes than we should be able to check if they are having same area or not.

Test the Program with different combinations test cases possibl
 * 
 * 
 */

public class Rectangle {

	private double length;
	private double breadth;

	public Rectangle(double length, double breadth)
	{
		this.length = (length>0) ? length : 0;
		this.breadth = (breadth>0) ? breadth : 0;
	}
	
	public double perimeter()
	{
		return 2*(this.length + this.breadth);
	}
	
	public double area()
	{
		return (this.length * this.breadth);
	}

	public boolean areaIsEqualOrnot(Rectangle rectangleToCompare)
	{
		if(this.area() == rectangleToCompare.area())
		return true;
		
		else
			return false;
	}
}
