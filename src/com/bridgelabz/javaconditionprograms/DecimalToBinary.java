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
		Utility utility=new Utility();
		System.out.println("Decimal number: "+decimalNumber);
		utility.decimalToBinary(decimalNumber);
	}

}
