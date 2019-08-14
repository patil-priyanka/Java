/******************************************************************************
 *  
 *  Purpose: calculate most frequent number.
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

public class RollDie {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no of times dice roll: ");
		int number=scanner.nextInt();
		int arrays[] = new int[number];
		int length=arrays.length;
		Random random=new Random();
		for(int i = 0; i < length; i++)
        {
			arrays[i]=(int)random.nextInt(6)+1;
			System.out.println(arrays[i]);
        }
		Utility utility=new Utility();
		utility.rollDie(length,arrays);
		scanner.close();
	}


}
