/******************************************************************************
 *  
 *  Purpose: To calculate prefect square root of the given number.
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   13-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.javaconditionprograms;

import com.bridgelabz.utility.Utility;

public class SquareRoot {

	public static void main(String[] args) {
		double number=Double.parseDouble(args[0]);
		Utility utility=new Utility();
		double result=utility.squareRoot(number);
		System.out.println("Prefect square root of the number: "+result);
	}

}
