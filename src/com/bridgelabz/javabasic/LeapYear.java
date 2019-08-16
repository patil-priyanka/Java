/******************************************************************************
 * 
 *  Purpose: Determines whether or not year is leap year.
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   08-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.javabasic;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year=scanner.nextInt();
		if(year<=1582) {
			System.out.println("Given year in the Gregorian calendar.");
		}
		else {
			boolean result=Utility.leapYear(year);
			if(result==true) 
				System.out.println("Given year is leap year");
		    else
				System.out.println("Given year is not leap year");
		}
		scanner.close();
	}

}
