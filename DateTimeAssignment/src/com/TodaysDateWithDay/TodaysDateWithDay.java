/*PROBLEM
 * 
	Write a Java application that displays today's date. You want the date to be displayed in the following format: 
	week day, month, date, and year.

	More specifically you want your Java application to display the date in the following manner:

	Tuesday, October 12, 2010
 */

package com.TodaysDateWithDay;

import java.time.LocalDate;

/**
 * 
 * @author Shubham Bhatt
 *TodaysDateWithDay is a public class which have only one method getDateWithDay which returns a string of current date with dayOfWeek name
 */
public class TodaysDateWithDay 
{
	/**
	 * method to return current date with dayOfWeek as a string
	 * @return
	 */
	public String  getDateWIthDay()
	{
		return LocalDate.now().getDayOfWeek().name() +", "+LocalDate.now().getMonth().name() +" " + LocalDate.now().getDayOfMonth()+", "+ LocalDate.now().getYear();
	}
	
}