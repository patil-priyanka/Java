/******************************************************************************
 *  
 *  Purpose: Gambler program.
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   09-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.javabasic;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Gambler {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter stack: ");
		int stack=scanner.nextInt();
		System.out.println("Enter goal: ");
		int goal=scanner.nextInt();
		System.out.println("Enter trials: ");
		int numberOfTimes=scanner.nextInt();
		Utility utility=new Utility();
		utility.gambler(stack, goal, numberOfTimes);
		scanner.close();
	}

}
