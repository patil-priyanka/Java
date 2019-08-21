/******************************************************************************
 *  
 *  Purpose: Determine wether given strings is PalindromeString or not .
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   20-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.staticfunction;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String string=scanner.nextLine();
		//Utility utility=new Utility();
		boolean result=Utility.palindromeString(string);
		System.out.println("string is palindrome: ");
		System.out.println(result);
		scanner.close();

	}

}
