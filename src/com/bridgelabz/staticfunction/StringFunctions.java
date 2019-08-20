package com.bridgelabz.staticfunction;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class StringFunctions {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1.Anagram \n2.Palindrom\n3.Recursion Method");
		System.out.println("Enter your choices: ");
		int choice=scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter two string");
			String string1=scanner.nextLine();
			String string2=scanner.nextLine();
			boolean result=Utility.anagram(string1, string2);
			System.out.println(result);
			break;
		case 2:
			System.out.println("Enter the string: ");
			String string=scanner.nextLine();
			boolean answer=Utility.palindromeString(string);
			System.out.println("string is palindrome: ");
			System.out.println(answer);
			break;
		case 3:
			System.out.println("Enter the string: ");
			String permutationstring=scanner.nextLine();
			Utility.recursionMethod(permutationstring, 0,permutationstring.length());
			break;
		default:
			System.out.println("Enter the correct choice ");
		}
		scanner.close();
	}

}
