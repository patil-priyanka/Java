/******************************************************************************
 *  
 *  Purpose: Averge, maximum value, minimum value in 5 number.
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   09-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.javabasic;

import java.util.Random;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class Stats5 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		double number1=random.nextInt() ;
		double number2=random.nextInt();
		double number3=random.nextInt();
		double number4=random.nextInt();
		double number5=random.nextInt();
		Utility.stats5(number1,number2,number3,number4,number5);
		scanner.close();
	}
}
