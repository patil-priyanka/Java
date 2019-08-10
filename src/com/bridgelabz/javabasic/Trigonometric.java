/******************************************************************************
 *  
 *  Purpose: Different trignometric operations.
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   09-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.javabasic;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Trigonometric {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter angle");
		double angle=Math.toRadians(scanner.nextDouble());
		Utility.trigonometric(angle);
		scanner.close();
	}

}
