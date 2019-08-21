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
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextLine();
		}
		System.out.println("Sorted array");
		Utility.mergeSortForString(array);
		scanner.close();

	}

}
