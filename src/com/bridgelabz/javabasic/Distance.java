/******************************************************************************
 *  
 *  Purpose: Calculate Euclidean distance from the point (x, y) to the origin (0, 0) .
 *
 *  @author  Priyanka Patil
 *  @version 1.0
 *  @since   08-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.javabasic;

import com.bridgelabz.utility.Utility;

public class Distance {
	public static void main(String []args) {
		int coordinateX=Integer.parseInt(args[0]);
		int coordinateY=Integer.parseInt(args[1]);
		double result=Utility.distanceBetPoints(coordinateX, coordinateY);
		System.out.println("Distance between origin and point(x,y): "+result);
	}

}
