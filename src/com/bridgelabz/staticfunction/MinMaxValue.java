/******************************************************************************
 *  
 *  Purpose: Calculate maximum and minimum value in given array.
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   20-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.staticfunction;

public class MinMaxValue {
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
		return minimum;
	}
	

}
