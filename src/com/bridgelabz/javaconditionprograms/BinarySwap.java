package com.bridgelabz.javaconditionprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BinarySwap {

	public static void main(String[] args) {
		System.out.println("Enter the Decimal number:");
		Scanner scanner=new Scanner(System.in);
		int decimalNumber=scanner.nextInt();
		Utility utility=new Utility();
		System.out.println("Decimal number: "+decimalNumber);
		utility.binarySwap(decimalNumber);
		scanner.close();
	}

}
