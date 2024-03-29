/******************************************************************************
 *  
 *  Purpose: To overload the sqrt function .
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   20-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.staticfunction;

public class OverloadingMethod {
	public static double sqrt(double number) {
		double epsilon=1e-15;
		double temp=number;
		while(Math.abs(temp - number/temp) > epsilon*temp) {
			temp=(number/temp+temp)/2.0;
		}
		return temp;
	}
	
	public static double sqrt(double number,double epsilon){
		double temp=number;
		while(Math.abs(temp - number/temp) > epsilon*temp) {
			temp=(number/temp+temp)/2.0;
		}
		return temp;
	}

}
