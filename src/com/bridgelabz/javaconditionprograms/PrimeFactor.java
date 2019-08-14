/******************************************************************************
 *  
 *  Purpose: Calculate prime factor of given number.
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   14-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.javaconditionprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeFactor {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int number=scanner.nextInt();
		Utility utility=new Utility();
		utility.primeFactor(number);
		scanner.close();
	}

}
