import java.time.LocalDate;
import java.time.Period;


public class Person {

	private String name;
	private int day,month,year;
	
	public Person(String name,int day, int month, int year)
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


	public void setDay(int day) {
		this.day = day;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public String toString() {
		LocalDate dob = LocalDate.of(this.year, this.month, this.day);
		Period age = Period.between(dob,LocalDate.now());
		
		return "Details of person "+ name +"\n"+ "name: "+ name +"\n Date of birth: "+this.year+"/"+this.month+"/"+this.day+"\n age: "+age.getYears()+" years "+age.getMonths() +" months "+age.getDays()+" days";
	}

	
	public String olderOne(Person personToCompare)
	{
			Period difference;
			LocalDate dobOfPersonOne = LocalDate.of(this.year, this.month, this.day);
			LocalDate dobOfPersonTwo = LocalDate.of(personToCompare.year, personToCompare.month, personToCompare.day);
			
			
				difference = Period.between(dobOfPersonOne, dobOfPersonTwo);
				if( difference.getYears()>0 && difference.getMonths()>0 && difference.getDays()>0)
				return personToCompare.name +" is older than "+ this.name +" by"+ difference.getYears() +" years, "+difference.getMonths()+" months,"+difference.getDays()+" days";
				
				else
				return this.name +" is older than "+ personToCompare.name +" by"+ Math.abs(difference.getYears()) +" years, "+Math.abs(difference.getMonths())+" months,"+Math.abs(difference.getDays())+" days";	
	}	
			
	
	public static void main(String []args)
	{
		Person personOne = new Person("Ram",12,12,1997);
		Person personTwo = new Person("Shyam",27,2,2000);
		
		System.out.println(personTwo.olderOne(personOne));
		System.out.println(personTwo.toString());
	}

	
	
}








/*	
int yearsOlder = this.year - personToCompare.year;
int monthsOlder = this.month - personToCompare.month;
int daysOlder = this.day - personToCompare.day;

if(yearsOlder<0 )
{	
	
	System.out.println(personToCompare.name + " is"+ yearsOlder +" years, "+ monthsOlder +" months, "+ daysOlder +" days"+ "older than "+this.name);
}
else if(yearsOlder>0)									//calling object is older in years
{
	if(monthsOlder<0)					//calling object is younger
	{
		yearsOlder = yearsOlder -1;
		monthsOlder = 12 + monthsOlder;				//since monthsOlder is already negative so we added 
		
		if(daysOlder<0)
		{
			monthsOlder = monthsOlder -1;
			
			int greaterDay = this.day>personToCompare.day ? this.day : personToCompare.day;
			daysOlder = 30 - greaterDay;
		}
		System.out.println(personToCompare.name + " is"+ yearsOlder +" years, "+ monthsOlder +" months, "+ daysOlder +" days"+ "older than "+this.name);
	}
	
}

else if(yearsOlder<0)
{
	if(monthsOlder<0)
	{
		monthsOlder = 12 + monthsOlder;
		
		if(daysOlder<0)
		{
			monthsOlder = monthsOlder -1;
			
			int greaterDay = this.day>personToCompare.day ? this.day : personToCompare.day;
			daysOlder = 30 - greaterDay;
			System.out.println(personToCompare.name + " is"+ yearsOlder +" years, "+ monthsOlder +" months, "+ daysOlder +" days"+ "older than "+this.name);
		}
		else
			System.out.println(personToCompare.name + " is"+ yearsOlder +" years, "+ monthsOlder +" months, "+ daysOlder +" days"+ "older than "+this.name);
	}
}	
else
{
	if(monthsOlder<0 && !(daysOlder==0))
	{
		int greaterDay = this.day>personToCompare.day ? this.day : personToCompare.day;
		
		if((monthsOlder*-1)>1)
		{
			daysOlder = 30 - greaterDay;
		
			System.out.println(this.name + " is"+ yearsOlder +" years, "+ monthsOlder +" months, "+ daysOlder +" days"+ "older than "+ personToCompare.name);
		}
	}
	 
	else
	System.out.println(personToCompare.name + " is"+ yearsOlder +" years, "+ monthsOlder +" months, "+ daysOlder +" days "+ "older than "+this.name);
	}
*/

