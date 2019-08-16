package com.bridgelabz.javaconditionprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class IterativeMethod {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String string=scanner.nextLine();
		Utility.iterativeMethod(string);
		scanner.close();

	}

}
