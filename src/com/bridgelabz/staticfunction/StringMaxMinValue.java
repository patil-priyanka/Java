/******************************************************************************
 *  
 *  Purpose: To override the maximum and minimum function .
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   20-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.staticfunction;

import java.util.Scanner;

public class StringMaxMinValue extends MinMaxValue {
	 public static int maximumValue(int[] array) {
			int length=array.length;
			int maximum=array[0];
			for(int i=0;i<length;i++) {
				if(array[i]>maximum) {
					maximum=array[i];
				}
			}
			return maximum;
	}
	
	 public static int minimumValue(int[] array) {
		int length=array.length;
		int minimum=array[0];
		for(int i=0;i<length;i++) {
			if(array[i]<minimum) {
				minimum=array[i];
			}
		}
		System.out.println("..");
		return minimum;
	}
	public static void main(String [] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the total number of element: ");
		int NoOfElement=scanner.nextInt();
		System.out.println("Enter the element: ");
		int []arrays=new int[NoOfElement];
		for(int i=0;i<arrays.length;i++) {
			arrays[i]=scanner.nextInt();
		}
		int maximumValue1=MinMaxValue.maximumValue(arrays);
		int minimumValue1=MinMaxValue.minimumValue(arrays);
		System.out.println("Maximum value in array: "+maximumValue1+"   Minimum Value in array: "+minimumValue1);
		scanner.close();
	}
}
