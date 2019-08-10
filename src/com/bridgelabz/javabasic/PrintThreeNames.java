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

public class PrintThreeNames {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the names: ");
		String names=scanner.nextLine();
		String[] string=names.split("\\s");
		Utility utility=new Utility();
		if(string.length==1) {
			System.out.println("Hi "+names);
		}
		else {
			String result=utility.printThreeNames(string);
			System.out.println("Hi "+result);
		}
		scanner.close();

	}

}
