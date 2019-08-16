package com.bridgelabz.staticfunction;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class RecursionMethod {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String string=scanner.nextLine();
		//String answer=
		
		Utility.recursionMethod(string, 0,string.length());
		//System.out.println(answer);
		scanner.close();
	}

}
