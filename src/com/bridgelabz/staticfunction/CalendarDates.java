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
