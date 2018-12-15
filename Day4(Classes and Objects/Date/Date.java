/*
 * Complete the implementation of the given Date class and test it by writing TestCases using JUnit:-


class Date { 
	private int d, m, y; // data members to store the day, month and year of a date.
	public Date(int d, int m, int y) //constructor to initialize Date objects
	{
		//initialize d, m, y of the current object using the d, m, y parameters. 
	}
	public String toString()// method to get the value of a Date object printed
	{
		//return the value of a Date object as a String in d/m/y format.
	}
	public boolean isSmaller(Date d)// method to check whether a date is smaller than the other 
	{
		//If the value of invoking Date object is smaller than the given object, true is returned otherwise false is returned.
	}
	public int[] diff(Date d) //method to find out the difference of days, months and years in two dates.
	{
		//The difference of days, months and years in the invoking and parameter Date objects 
		//is obtained and returned in an int array. The first element of the array should represent
		//difference of days; second one, the difference of months and the third one, the difference of years.
	}
}

 */

public class Date {

	private int day;
	private int  month;
	private int year;
	
	public Date(int day, int month, int year)
	{
		this.day = day;
		this.month= month;
		this.year = year;
	}
	
	public String toString()
	{
		String dateAsAString = this.day +"/" + this.month + "/" + this.year;
		return dateAsAString;
	}
	
	public boolean isSmaller(Date dateToCompare)
	{
		if(this.year < dateToCompare.year)   // if year of calling date object is less than the object, with which we are comparing 
		return true;
		
		else if(this.year == dateToCompare.year)  // if year of both date object's is equal
		{
			if(this.month < dateToCompare.month)  // checking if month of calling date object is less than the comparing object
				return true;						//because month of calling object is less than the comparing object and year is same
			
			else if(this.month == dateToCompare.month)	// if months are also equal
			{
				if(this.day< dateToCompare.day) // if day of calling object is less than than the object we are comparing
					return true;				// as year, month are same and day of calling object is lesser 
				
				else
					return false;              //as calling object is greater 
			}
			else
				return false;
		}
		
		else 
			return false;    //because year of calling object is greater the comparing object
	}
	
	public int[] difference(Date dateToFindDifference)
	{
		int dateDifference[] = new int[3];
		dateDifference[0] = this.day - dateToFindDifference.day>0 ? this.day - dateToFindDifference.day:  dateToFindDifference.day - this.day;
		dateDifference[1] = this.month - dateToFindDifference.month>0 ? this.month - dateToFindDifference.month : dateToFindDifference.month - this.month ;
		dateDifference[2] = this.year - dateToFindDifference.year>0 ? this.year - dateToFindDifference.year : dateToFindDifference.year -  this.year;
		
		return dateDifference;
	}
}
