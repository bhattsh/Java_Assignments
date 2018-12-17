/*  PROBLEM
 * 
  Write a class called Triangle that can be used to represent a triangle. It should include the following methods that return boolean values indicating if the particular property holds:

isRight (a right triangle)
isScalene (no two sides are the same length)
isIsosceles (exactly two sides are the same length)
isEquilateral (all three sides are the same length)
Write a simple tester program that creates a few triangles and asks them about their type.

NOTE: Write appropriate TestCases.

*/
public class Triangle 
{
	private float sideOne;
	private float sideTwo;
	private float sideThree;
	
	public Triangle(float sideOne, float sideTwo, float sideThree)
	{
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}
	
	public boolean isEquilateral()
	{
		if(sideOne == sideTwo && sideTwo == sideThree)
			return true;
		else
			return false;	
	}
	
	public boolean isScalene()
	{
		if(sideOne != sideTwo && sideTwo != sideThree && sideOne != sideThree)
			return true;
		else
			return false;
	}
	
	
	public boolean isIsosceles()
	{
		if((sideOne == sideTwo && sideTwo != sideThree) || (sideTwo == sideThree && sideTwo != sideOne) || (sideOne == sideThree && sideOne != sideTwo))
			return true;
		else
			return false;
	}
	
	
	public boolean isRightTriangle()
	{	
		if(sideOne> sideTwo && sideOne>sideThree)
			return sideOne*sideOne == (sideTwo*sideTwo +sideThree*sideThree)? true : false; 
	
		else if(sideTwo>sideOne && sideTwo>sideThree)
			return sideTwo*sideTwo == (sideOne*sideOne +sideThree*sideThree)? true : false; 
		
		else if(sideThree>sideOne && sideThree>sideTwo)
			return sideThree*sideThree == (sideTwo*sideTwo +sideOne*sideOne)? true : false; 
		
		else
			return false;
		
	}
}	
