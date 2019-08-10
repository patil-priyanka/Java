/******************************************************************************
 * 
 *  Purpose: Perform the different operations on double.
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   08-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.javabasic;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DoubleOperations {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first double: ");
		double firstNumber=scanner.nextDouble();
		System.out.println("Enter the second double: ");
		double secondNumber=scanner.nextDouble();
		System.out.println("Enter  the third double: ");
		double thirdNumber=scanner.nextDouble();
		Utility utility=new Utility();
		utility.doubleOperations(firstNumber, secondNumber, thirdNumber);
		scanner.close();
	}

}
