/******************************************************************************
 *  
 *  Purpose: To find Day Of Week for given a date .
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   20-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.staticfunction;

import com.bridgelabz.utility.Utility;

public class Calender {

	public static void main(String[] args) {
		int day=Integer.parseInt(args[0]);
		int month=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
		System.out.println("Date: "+day+"-"+month+"-"+year);
		String result=Utility.calendar(day, month, year);
		System.out.println(result);

	}

}
