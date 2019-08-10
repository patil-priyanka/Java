/******************************************************************************
 *  
 *  Purpose: Given string names in reverse order .
 *
 *  @author  Priyanka Patil
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.javabasic;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TemperaturConversion {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Utility utility=new Utility();
		System.out.println("\n1.Celsius to Fahrenheit \n2.Fahrenheit to Celsius\nEnter your choices:");
		int choice=scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter tempreture: ");
			double celsiusTempreture=scanner.nextDouble();
			double result=utility.tempretureConversion(celsiusTempreture, choice);
			System.out.println("Celsius: "+celsiusTempreture+"Fahrenheit: "+result);
			break;
		case 2:
			System.out.println("Enter tempreture: ");
			double fahrenheitTempreture=scanner.nextDouble();
			double answer=utility.tempretureConversion(fahrenheitTempreture, choice);
			System.out.println("Fahrenheit: "+fahrenheitTempreture+"Celsius: "+answer);
			break;
		}
		scanner.close();

	}

}
