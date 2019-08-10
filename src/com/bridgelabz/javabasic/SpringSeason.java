/******************************************************************************
 *  
 *  Purpose: Determine day d of month m is between March 20 and June 20 .
 *
 *  @author  Priyanka Patil
 *  @version 1.0
 *  @since   08-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.javabasic;

import com.bridgelabz.utility.Utility;

public class SpringSeason {

	public static void main(String[] args) {
		int day=Integer.parseInt(args[0]);
		int month=Integer.parseInt(args[1]);
		Utility utility=new Utility();
		boolean result=utility.springSeason(day,month);
		System.out.println(result);

	}

}
