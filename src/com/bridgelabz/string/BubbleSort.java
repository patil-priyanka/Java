/******************************************************************************
 *  
 *  Purpose: Print the sorted array using bubble sort.
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   21-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.string;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of element");
		int number=scanner.nextInt();
		int []array=new int[number];
		System.out.println("Enter the element");
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
		}
		System.out.println("Sorted array");
		Utility.bubbleSort(array);
		scanner.close();

	}

}
