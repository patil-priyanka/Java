/******************************************************************************
 *  
 *  Purpose: To perform different mathematics operation .
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   20-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.staticfunction;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class MathFunction {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1.harmonic series\n2.sin and cos angle\n3.Decimal To Binary conversion\n4.factorial\n5.prime number\n6.Future Value\n7.Present value\n8.Minimum and maximum value in array\n9.colinear\n10.overloading method");
		System.out.println("\n Enter your choice: ");
		int choice=scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("---------------harmonic series--------------");
			System.out.println("Enter the number for harmonic series: ");
			int harmonicNumber=scanner.nextInt();
			double sum=Utility.harmonicNumber(harmonicNumber);
			System.out.println("Sum of harmonic number: "+sum);
			break;
		case 2:
			System.out.println("\n-----------------sin and cos angle-----------");
			System.out.println("Enter the  angle:");
			double angle=scanner.nextDouble();
			double sinAngle=Utility.sin(angle);
			System.out.println("sin("+angle+") : "+sinAngle);
			double cosAngle=Utility.cos(angle);
			System.out.println("cos("+angle+") : "+cosAngle);
			break;
		case 3:
			System.out.println("-------------Decimal To Binary conversion------------");
			System.out.println("\nEnter decimal number ");
			int decimalNumber=scanner.nextInt();
			System.out.println("Decimal number: "+decimalNumber);
			String string=Utility.decimalToBinary(decimalNumber);
			System.out.println("Binary number: "+string);
			break;
		case 4:
			System.out.println("-----------------factorial----------------------");
			System.out.println("\nEnter the number for calculate factorial");
			int factorialNumber=scanner.nextInt();
			long factorials=Utility.factorial(factorialNumber);
			System.out.println("Factorial:"+factorials);
			break;
		case 5:
			System.out.println("---------------prime number------------------");
			System.out.println("\nEnter the number for detrmine number is prime or not:");
			int primeNumber=scanner.nextInt();
			boolean isprimenumber=Utility.isPrime(primeNumber);
			System.out.println(isprimenumber);
			break;
		case 6:
			System.out.println("---------------Future value in compound interest------------------");
			System.out.println("Enter  the amount: ");
			int principal=scanner.nextInt();
			System.out.println("Enter  the rate: ");
			int rate=scanner.nextInt();
			System.out.println("Enter the time: ");
			int year=scanner.nextInt();
			double futureValue=Utility.futureValue(principal,rate,year);
			System.out.println("Future value= "+futureValue);
			break;
		case 7:
			System.out.println("---------------Present value in compound interest------------------");
			System.out.println("Enter  the amount: ");
			int amount=scanner.nextInt();
			System.out.println("Enter  the rate: ");
			int presentRate=scanner.nextInt();
			System.out.println("Enter the time: ");
			int presentYear=scanner.nextInt();
			double presentValue=Utility.prsentValue(amount, presentRate, presentYear);
			System.out.println("Future value= "+presentValue);
			break;
		case 8:
			System.out.println("Enter the total number of element: ");
			int totalNoOfElement=scanner.nextInt();
			System.out.println("Enter the element: ");
			int []array=new int[totalNoOfElement];
			for(int i=0;i<array.length;i++) {
				array[i]=scanner.nextInt();
			}
			int maximum=Utility.maximumValue(array);
			int minimum=Utility.minimumValue(array);
			System.out.println("Maximum value in array: "+maximum+"\nMinimum Value in array: "+minimum);
			break;
		case 9:
			System.out.println("Enter the coordinate of three points");
			int [] coordinates=new int[6];
			for(int i=0;i<6;i++) {
				if(i%2==0) {
					System.out.println("x"+i/2+": ");
					coordinates[i]=scanner.nextInt();
				}
				else {
					System.out.println("y"+i/2+": ");
					coordinates[i]=scanner.nextInt();
				}
			}
			boolean slopeColinear=Utility.checkCollinearUsingSlope(coordinates);
			System.out.println("given slope is colinear: "+slopeColinear);
			boolean triangleColinear=Utility.checkCollinearUsingArea(coordinates);
			System.out.println("given triangle is colinear: "+triangleColinear);
			break;
		case 10:
			System.out.println("Enter the number: ");
			double number=scanner.nextDouble();
			double squareRoot=OverloadingMethod.sqrt(number);
			System.out.println("1st method Prefect square root of the number: "+squareRoot);
			double epsilon=1e-15;
			double sqrt=OverloadingMethod.sqrt(number,epsilon);
			System.out.println("2nd method Prefect square root of the number: "+sqrt);
			break;
		default:
			System.out.println("Invalid choice");
		}
		scanner.close();
	
	}

}
