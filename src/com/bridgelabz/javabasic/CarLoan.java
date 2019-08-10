/******************************************************************************
 *  
 *  Purpose: Determine compount interest on loan.
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   09-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.javabasic;

import com.bridgelabz.utility.Utility;

public class CarLoan {

	public static void main(String[] args) {
		int principal=Integer.parseInt(args[0]);
		double rate=Double.parseDouble(args[1]);
		int year=Integer.parseInt(args[2]);
		Utility utility=new Utility();
		double result=utility.carLoan(principal, rate, year);
		System.out.println("Principal: "+principal+"\tRate: "+rate+"\tYear: "+year);
		System.out.println("Monthly payment:"+result);
	}

}
