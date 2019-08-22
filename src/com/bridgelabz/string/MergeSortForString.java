package com.bridgelabz.string;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class MergeSortForString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of element");
		int number=scanner.nextInt();
		String []array=new String[number];
		System.out.println("Enter the element");
		for(int i=0;i<number;i++) {
			System.out.println(i);
			array[i]=scanner.next();
		}
		System.out.println("Sorted array");
		String[] string=Utility.mergeSortForString(array);
		for(int i=0;i<string.length;i++) {
			System.out.println(string[i]);
		}
		scanner.close();

	}

}
