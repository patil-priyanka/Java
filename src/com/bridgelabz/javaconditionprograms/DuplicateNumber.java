/******************************************************************************
 *  
 *  Purpose: Find duplicate number in given array.
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   14-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.javaconditionprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DuplicateNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter total number count: ");
		int count=scanner.nextInt();
		int[] array=new int[count];
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
		}
		Utility utility=new Utility();
		int result=utility.duplicateNumber(array);
		System.out.println("duplicate number:  "+result);
		scanner.close();

	}

}
