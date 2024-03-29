/******************************************************************************
 *  
 *  Purpose: To perform permutation of given string using recursion method .
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   20-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.staticfunction;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class RecursionMethod {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String string=scanner.nextLine();
		Utility.recursionMethod(string, 0,string.length());
		scanner.close();
	}

}
