/******************************************************************************
 *  
 *  Purpose: Coin flip and calculate percentage of Head vs Tail.
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   13-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.javaconditionprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		System.out.println("Enter the number of flip coin:");
		Scanner scanner=new Scanner(System.in);
		int numberOfFlip=scanner.nextInt();
		Utility.flipCoin(numberOfFlip);
		scanner.close();
	}

}
