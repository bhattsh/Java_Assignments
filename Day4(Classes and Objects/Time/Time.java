
public class Time {

	private int hours;
	private int minutes;
	
	public void setTime(int hours, int minutes)
	{
		if(hours >24 && minutes >60)
		{
			this.hours = -1;
			this.minutes = -1;
		}
		else
		{
			this.hours = hours;
			this.minutes = minutes;
		}

	}
	
	public void showTime()
	{
		System.out.println("time is: "+this.hours + ":"+ this.minutes);
	}
	
	
	public int getHours()
	{
		return this.hours;
	}
	
	public int getMinutes()
	{
		return this.minutes;
	}
	
	
	public Time timeSum(Time timeOne, Time timeTwo)
	{
		if(timeOne.minutes<0 || timeOne.hours<0 || timeTwo.minutes<0 || timeTwo.hours<0)
		{
			this.hours = -1;
			this.minutes = -1;
		
			return this;
		}
		
		else
		{	
		int minuteSum = this.minutes + timeOne.minutes + timeTwo.minutes;
		if(minuteSum>59)
		{
			if(minuteSum == 60)
				this.hours = this.hours +1;
			else
			{
			int minutesGreaterThanSixty =  minuteSum - 60;
			this.hours = this.hours +1;
			this.minutes = this.minutes + minutesGreaterThanSixty;
			}
		}
		else
			this.minutes = minuteSum;
		
		int hourSum = this.hours + timeOne.hours + timeTwo.hours;
		
		if(hourSum>23)
		{
			if(hourSum == 24)
				this.hours = 00;
			else
			{
				int hourGreaterThanTwentyFour = hourSum - 24;
				 this.hours = hourGreaterThanTwentyFour;
			}
		}
		else
			this.hours = hourSum;
		
		System.out.println(this.hours+":"+this.minutes);
		
		return this;
	}
	}

}
