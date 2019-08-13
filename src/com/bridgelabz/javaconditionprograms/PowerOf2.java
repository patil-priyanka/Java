/******************************************************************************
 *  
 *  Purpose: To calculate power of 2 upto given range.
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   13-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.javaconditionprograms;

import com.bridgelabz.utility.Utility;

public class PowerOf2 {

	public static void main(String[] args) {
		int range=Integer.parseInt(args[0]);
		Utility.powerOf2(range);
	}

}
