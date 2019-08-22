/******************************************************************************
 *  
 *  Purpose: To search the string in given string array.
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   21-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.string;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BinarySearchString {
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		try {
			BufferedReader objReader=new BufferedReader( new FileReader("/home/admin6/eclipse-workspace/JavaPrograms/src/com/bridgelabz/string/Names.txt"));
			StringBuilder sb = new StringBuilder();
			String line = objReader.readLine();
			while (line != null) {
		            sb.append(line);
		            line = objReader.readLine();
		    }
		    System.out.println(sb.toString());
		    System.out.println("Enter the want you want to search in the string");
		    String search=scanner.nextLine();
		    String string=sb.toString();
		    String[] stringArray=string.split(",");
			Arrays.sort(stringArray);
		    int result=Utility.binarySearchString(stringArray,search);
		    if(result==-1) {
		    	System.out.println("\nString is not found");
		    }
		    else
		    	System.out.println("\nString found at "+(result+1)+" position");
		    objReader.close();
		}
        catch (Exception e) {
            System.out.println(e);
        }
		scanner.close();
	}

}
