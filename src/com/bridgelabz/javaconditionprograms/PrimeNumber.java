/******************************************************************************
 *  
 *  Purpose: To print all prime number between the range.
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   13-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.javaconditionprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the lower limit:");
		Scanner scanner=new Scanner(System.in);
		int lowerLimit=scanner.nextInt();
		System.out.println("Enter the upper limit:");
		int upperLimit=scanner.nextInt();
		Utility utility=new Utility();
		utility.primeNumber(lowerLimit, upperLimit);
		scanner.close();
	}

}
