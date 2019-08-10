/******************************************************************************
 *  
 *  Purpose: to calculate root of given quadratic equation. .
 *
 *  @author  Priyanka Patil
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.javabasic;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double firstNumber=scanner.nextDouble();
		System.out.println("Enter the second number: ");
		double secondNumber=scanner.nextDouble();
		System.out.println("Enter  the third number: ");
		double thirdNumber=scanner.nextDouble();
		Utility utility=new Utility();
		utility.quadraticEquation(firstNumber, secondNumber, thirdNumber);
		scanner.close();
	}

}
