/******************************************************************************
 *  
 *  Purpose: Sum of two dices integers .
 *
 *  @author  Priyanka Patil
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.javabasic;

import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SumOfTwoDice {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		int dice1=(int)random.nextInt(6)+1 ;
		int dice2=(int)random.nextInt(6) +1;
		Utility utility=new Utility();
		int result=utility.sumOfTwoDice(dice1, dice2);
		System.out.println("First dices: "+dice1+"\t Second dices: "+dice2+"\nSum of two dices: "+result);
		scanner.close();
	}

}
