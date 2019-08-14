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

import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DuplicateNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[] array=new int[100];
		Random random=new Random();
		for(int i=0;i<array.length;i++) {
			array[i]=(int)random.nextInt(100)+1;
			System.out.print(" "+array[i]);
		}
		Utility utility=new Utility();
		System.out.println("\nduplicate number:  ");
		utility.duplicateNumber(array);
		scanner.close();

	}

}
