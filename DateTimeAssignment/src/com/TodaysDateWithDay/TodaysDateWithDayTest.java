package com.TodaysDateWithDay;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Shubham Bhatt
 *TodaysDateWithDayTest class is a test class which test if the date is getting in format "DayName, MonthName day, year" like this or not
 **/
public class TodaysDateWithDayTest 
{
	private TodaysDateWithDay dateWithDay;
	
	@Before
	public void setUp()
	{
		dateWithDay = new TodaysDateWithDay();
	}
	
	@Test
	public void getCurrentDateWithDayTest() 	//test to get date in format like this : "DayName, MonthName day, year"
	{
		assertEquals("TUESDAY, DECEMBER 25, 2018",dateWithDay.getDateWIthDay()); //TUESDAY, DECEMBER 25, 2018
	}

}