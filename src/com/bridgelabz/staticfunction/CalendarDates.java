/******************************************************************************
 *  
 *  Purpose: To print Calendar of the month .
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   20-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.staticfunction;

import com.bridgelabz.utility.Utility;

public class CalendarDates {

	public static void main(String[] args) {
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		//System.out.println("Date: "+day+"-"+month+"-"+year);
		Utility.calendarDates(1, month, year);
		//System.out.println(result);
	
	}

}
