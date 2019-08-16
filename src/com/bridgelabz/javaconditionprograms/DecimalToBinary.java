/******************************************************************************
 *  
 *  Purpose: To convert decimal number to binary number.
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   13-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.javaconditionprograms;

import com.bridgelabz.utility.Utility;

public class DecimalToBinary {

	public static void main(String[] args) {
		int decimalNumber=Integer.parseInt(args[0]);
		System.out.println("Decimal number: "+decimalNumber);
		String string=Utility.decimalToBinary(decimalNumber);
		int stringToInt=Integer.parseInt(string); 
		string=String.format("%032d",stringToInt);
		System.out.println(string);
	}

}
