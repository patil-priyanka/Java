package com.bridgelabz.javaconditionprograms;

/******************************************************************************
 *  
 *  Purpose: Find second largest and smallest number in array.
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   14-08-2019
 *
 ******************************************************************************/
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SecondNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int number=scanner.nextInt();
		int arrays[] = new int[number];
		int length=arrays.length;
		System.out.println("Enter the number: ");
		for(int i = 0; i < length; i++)
        {
			arrays[i]=scanner.nextInt();
        }
		Utility utility=new Utility();
		utility.secondNumber(length,arrays);
		scanner.close();

	}

}
