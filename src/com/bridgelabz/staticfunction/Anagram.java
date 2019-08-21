/******************************************************************************
 *  
 *  Purpose: Determine wether given strings is anagram or not .
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   20-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.staticfunction;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two string");
		String string1=scanner.nextLine();
		String string2=scanner.nextLine();
		boolean result=Utility.anagram(string1, string2);
		System.out.println(result);
		scanner.close();
	}

}
