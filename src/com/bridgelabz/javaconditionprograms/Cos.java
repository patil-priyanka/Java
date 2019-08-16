/******************************************************************************
 *  
 *  Purpose: To calculate cos value of given angle using taylor series expansion.
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   13-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.javaconditionprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Cos {

	public static void main(String[] args) {
		System.out.println("Enter the cos angle:");
		Scanner scanner=new Scanner(System.in);
		double angle=scanner.nextDouble();
		double result=Utility.cos(angle);
		System.out.println("cos("+angle+") : "+result);
		scanner.close();
	}

}
