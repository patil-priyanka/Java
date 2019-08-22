package com.bridgelabz.string;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FrequencyCount {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string");
		String string=scanner.nextLine();
		String []array=string.split("\\s");
		Utility.frequencyCount(array);
		scanner.close();

	}

}
