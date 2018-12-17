import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CountryTest
{
	private Country []countries;					//array of reference variable of type country

	@Before
	public void setup()
	{	
		countries = new Country[5];					//array of Class country
		countries[0] = new Country("India",4000000,2000);
		countries[1] = new Country("America",100000,3000);
		countries[2] = new Country("China",5000000,6000);
		countries[3] = new Country("South Africa",220000,4000);
		countries[4] = new Country("Australia",100000,500);
	
	}

	@Test													//test to check country with highest population
	public void testHighestPopulation() 
	{
		float highestPopulation = countries[0].getPopulation(); 
		
		for(int count=1;count<countries.length;count++)
		{
				if(highestPopulation < countries[count].getPopulation())
				{
					highestPopulation = countries[count].getPopulation();
				}
		}
		
		assertEquals(5000000,highestPopulation,0);
	}
	
	
	@Test														// test to check country with biggest area
	public void testBiggestArea() 
	{
		float biggestArea = countries[0].getArea(); 
		
		for(int count=1;count<countries.length;count++)
		{
				if(biggestArea < countries[count].getArea())
				{
					biggestArea = countries[count].getArea();
				}
		}
		
		assertEquals(6000,biggestArea,0);
	}
	
	
	
	@Test																//test to check density which is POPULATION/AREA
	public void testHighestDensity() 			
	{
		float highestDensity = countries[0].getPopulation()/countries[0].getArea(); 
		
		for(int count=1;count<countries.length;count++)
		{
				if( highestDensity < (countries[count].getPopulation()/countries[count].getArea()) )
				{
					highestDensity = (countries[count].getPopulation()/countries[count].getArea());
				}
		}
		
		assertEquals(2000,highestDensity,0);
	}

}
