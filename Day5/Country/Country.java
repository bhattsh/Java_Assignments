/* 	PROBLEM
Define a class Country that stores the name of the country, its population, and its area. Using that class, write a test program that creates a few countries and stores them in an array and then prints

The country with the largest area
The country with the largest population
The country with the largest population density (people per square mile)

NOTE: Write appropriate TestCases.
 * 
 */

public class Country {

	private String country;
	private float population;
	private float area;
	
	public Country(String country, float population, float area)
	{
		this.country = country;
		this.population = population;
		this.area = area;
	}

	public float getPopulation() {
		return population;
	}

	public void setPopulation(float population) {
		this.population = population;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}
	
	
}
