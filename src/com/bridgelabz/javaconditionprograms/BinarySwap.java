/******************************************************************************
 *  
 *  Purpose: To convert decimal to binary number and swap nibbles and calculate new decimal number.
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   14-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.javaconditionprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BinarySwap {

	public static void main(String[] args) {
		System.out.println("Enter the Decimal number:");
		Scanner scanner=new Scanner(System.in);
		int decimalNumber=scanner.nextInt();
		Utility utility=new Utility();
		System.out.println("Decimal number: "+decimalNumber);
		int result=utility.binarySwap(decimalNumber);
		System.out.println("New decimal Number: "+result);
		scanner.close();
	}

}
