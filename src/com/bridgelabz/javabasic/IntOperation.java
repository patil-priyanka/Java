/******************************************************************************
 *  
 *  Purpose: This program perform operations on integer.
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.javabasic;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class IntOperation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int firstNumber=scanner.nextInt();
		System.out.println("Enter the second integer: ");
		int secondNumber=scanner.nextInt();
		System.out.println("Enter the third integer: ");
		int thirdNumber=scanner.nextInt();
		Utility utility=new Utility();
		utility.intOperation(firstNumber, secondNumber, thirdNumber);
		scanner.close();
	}

}
