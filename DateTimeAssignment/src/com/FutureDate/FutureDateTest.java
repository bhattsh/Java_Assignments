package com.FutureDate;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.Before;

/**
 * 
 * @author Shubham Bhatt
 *FutureDateTest is a test class to get a future date after adding days to a date
 */
public class FutureDateTest 
{
	private FutureDate date;
	
	@Before
	public void setUp()
	{
		date = new FutureDate();
	}
	
	
	@Test
	public void getFutureDateTestWithRightFormatAndMoreThanAMonthDays() 		//test for getting future date with valid date format
	{
		
		LocalDate futureDate = date.getFutureDate("11/04/2009",45);			//adding more than a month days 
		assertEquals("2009-05-26",futureDate.toString());
	}
	
	
	@Test
	@Ignore
	public void getFutureDateTestWithMoreThanAYearDays() 		//test for getting future date with valid date format
	{
		
		LocalDate futureDate = date.getFutureDate("11/04/2009",368);			//adding more than a year days
		assertEquals("2010-04-14",futureDate.toString());
	}
	
	
	@Test	
	@Ignore//test of getting future date with invalid date format
	public void getFutureDateTestWithWrongDateFormat() 
	{
		try
		{
			date.getFutureDate("11-04-2009",45);			//invalid date so exception will occur
		}
		catch(DateTimeParseException e)
		{
			System.out.println("Invalid Date format.");

		 }
	}

}
