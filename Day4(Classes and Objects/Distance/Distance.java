/*
  Write the definition for a class called Distance that has properties feet as integer  and inches as float.

 	The class has the following behaviours/services/methods:
	void set(int, float) to give value to object
	void disp() to display distance in feet and inches
	Distance add(Distance) to sum two distances & return distance
1. Write the definitions for each of the above member functions.
2. Write DistanceTest class with main function to create three Distance objects. Set the value in two objects and call add() to calculate sum and assign it in third object. Display all distances.

 
 */
public class Distance {

	private int feet;
	private float inches;
	
	public void set(int feet, float inches)
	{
			this.feet = feet;
			this.inches = inches;
	}

	
	public void display()
	{
		System.out.println("distance is: "+this.feet + "'"+ this.inches);
	}
	
	
	public int getFeet()
	{
		return this.feet;
	}
	
	public float getInches()
	{
		return this.inches;
	}
	
	
	public Distance distanceSum(Distance distanceOne, Distance distanceTwo)
	{
		if(distanceOne.inches<0 || distanceTwo.inches<0 || distanceOne.feet<0 || distanceTwo.feet<0)   // return -1 if inches or feet to add are less than zero
		{
			this.feet = -1;
			this.inches = -1;
			return this;
		}
		
		float totalInchesToAdd = distanceOne.inches +distanceTwo.inches;       // adds total inches to add
		if(totalInchesToAdd > 12)                                              //if total inches to add are greater than 12
		{
			int numberOfFeetFromInches = (int)totalInchesToAdd/12;
			float inchesToAdd = totalInchesToAdd%12;
			
			this.feet = numberOfFeetFromInches + distanceOne.feet + distanceTwo.feet;
			this.inches = inchesToAdd;
			
			System.out.println("sum of two distances in feet and inches is "+ this.feet + "'" + this.inches +"\"");
			return this;
		}
		else																//if total inches to add are less than or equal to twelve
		{
			this.inches = totalInchesToAdd;
			this.feet = distanceOne.feet +distanceTwo.feet;
			
			System.out.println("sum of two distances in feet and inches is "+ this.feet + "'" + this.inches +"\"");
			return this;
		}
		
	}
}

