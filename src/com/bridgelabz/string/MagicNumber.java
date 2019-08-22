package com.bridgelabz.string;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class MagicNumber {

	public static void main(String[] args) {
		int number=Integer.parseInt(args[0]);
		Scanner scanner=new Scanner(System.in);
		int sum=1;
		for(int i=1;i<=number;i++) {
			sum=sum*2;
		}
		System.out.println("Enter the number want you wants to be search between 0 to "+(sum-1));
		int key=scanner.nextInt();
		Utility.magicNumber(key, 0, sum, number);
		scanner.close();
	}

}
