/*PROBLEM
 * 	Write a java program using class and object to accept a date in the string format dd/mm/yyyy.
 *  Check whether the date entered is valid or not. If it is valid, then input a certain number of days.
 *  Then calculate and print the future date after adding the given number of days if the future date is valid. If the date entered is invalid, then display a proper error message.
Example
	Enter the date in (dd/mm/yyyy) format: 18/02/2014
	Entered Date: 18/02/2014
	Enter number of days after which future date is to be found: 2
	Future Date : 20/2/2014
 */

package com.FutureDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @author Shubham Bhatt
 *
 */
public class FutureDate
{
	public LocalDate getFutureDate(String dateToValidate, int daysToAddInDate)
	{ 
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(dateToValidate, formatter); 
		LocalDate futureDate = date.plusDays(daysToAddInDate); 
		System.out.printf("Successfully parsed String %s, date is %s%n", dateToValidate, date); 
		System.out.println("future date: "+futureDate);
		
		return futureDate;

	}
}