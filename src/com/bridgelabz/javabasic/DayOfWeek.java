package com.bridgelabz.javabasic;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		int day=Integer.parseInt(args[0]);
		int month=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
		Utility utility=new Utility();
		int result=utility.dayOfWeek(day, month, year);
		System.out.println("Date: "+day+"-"+month+"-"+year);
		if(result==1)
			System.out.println("Monday");
		else if(result==2)
			System.out.println("Tuesday");
		else if(result==3)
			System.out.println("Wednsday");
		else if(result==4)
			System.out.println("Thirdsday");
		else if(result==5)
			System.out.println("Friday");
		else if(result==6)
			System.out.println("Saturday");
		else if(result==0)
			System.out.println("Sunday");
		else
			System.out.println("Incorrect Date");

	}

}
