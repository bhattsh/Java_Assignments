import java.time.LocalDate;
import java.time.Period;


public class Person {

	private String name;
	private int day,month,year;
	
	public Person(String name,int day, int month, int year)   //constructor to initialize object
	{
		this.name = name;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}


	

	@Override											//return values in object as a string
	public String toString() {
		LocalDate dob = LocalDate.of(this.year, this.month, this.day);
		Period age = Period.between(dob,LocalDate.now());
		
		return "Details of person-> "+  "name: "+ name +" Date of birth: "+this.year+"/"+this.month+"/"+this.day+" age: "+age.getYears()+" years "+age.getMonths() +" months "+age.getDays()+" days";
	}

	
	public String olderOne(Person personToCompare)		//compares two persons age and return the result as a string 
	{
			Period difference;
			LocalDate dobOfPersonOne = LocalDate.of(this.year, this.month, this.day);
			LocalDate dobOfPersonTwo = LocalDate.of(personToCompare.year, personToCompare.month, personToCompare.day);
			
				if(dobOfPersonOne.equals(dobOfPersonTwo))
					return "Both "+this.name +" and "+ personToCompare.name +" are of same age";
				
				difference = Period.between(dobOfPersonOne, dobOfPersonTwo);
				if( difference.getYears()>0 && difference.getMonths()>0 && difference.getDays()>0)
				return personToCompare.name +" is older than "+ this.name +" by "+ difference.getYears() +" years, "+difference.getMonths()+" months,"+difference.getDays()+" days";
				
				else
				return this.name +" is older than "+ personToCompare.name +" by "+ Math.abs(difference.getYears()) +" years, "+Math.abs(difference.getMonths())+" months,"+Math.abs(difference.getDays())+" days";	
	}	
			
}
