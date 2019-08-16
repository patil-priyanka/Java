package com.bridgelabz.staticfunction;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class MathFunction {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("---------------harmonic series--------------");
		System.out.println("Enter the number for harmonic series: ");
		int harmonicNumber=scanner.nextInt();
		double sum=Utility.harmonicNumber(harmonicNumber);
		System.out.println("Sum of harmonic number: "+sum);
		System.out.println("\n-----------------sin and cos angle-----------");
		System.out.println("Enter the  angle:");
		double angle=scanner.nextDouble();
		double sinAngle=Utility.sin(angle);
		System.out.println("sin("+angle+") : "+sinAngle);
		double cosAngle=Utility.cos(angle);
		System.out.println("cos("+angle+") : "+cosAngle);
		System.out.println("-------------Decimal To Binary conversion------------");
		System.out.println("\nEnter decimal number ");
		int decimalNumber=scanner.nextInt();
		System.out.println("Decimal number: "+decimalNumber);
		String string=Utility.decimalToBinary(decimalNumber);
		System.out.println("Binary number: "+string);
		System.out.println("-----------------factorial----------------------");
		System.out.println("\nEnter the number for calculate factorial");
		int factorialNumber=scanner.nextInt();
		long factorials=Utility.factorial(factorialNumber);
		System.out.println("Factorial:"+factorials);
		System.out.println("---------------prime number------------------");
		System.out.println("\nEnter the number for detrmine number is prime or not:");
		int primeNumber=scanner.nextInt();
		boolean isprimenumber=Utility.isPrime(primeNumber);
		System.out.println(isprimenumber);
		
		System.out.println("---------------compound interest------------------");
		System.out.println("Enter  the amount: ");
		int principal=scanner.nextInt();
		System.out.println("Enter  the rate: ");
		int rate=scanner.nextInt();
		System.out.println("Enter the time: ");
		int year=scanner.nextInt();
		double futureValue=Utility.compountInterest(principal,rate,year);
		System.out.println("Future value= "+futureValue);
		scanner.close();
	
	}

}
