/******************************************************************************
 *  
 *  Purpose: This program which define logic of all programs.
 *
 *  @author  Priyanka
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.utility;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	
	/** 
	 * Purpose: Reverse given string
	 * 
	 * @param 	string		enter the name
	 * @return 	reverse 	Return reverse of given string
	 */
	public String printThreeNames(String string[]) {
		String reverse="";
		for(int i=string.length-1;i>=0;i--) {
			if(i==0)
				reverse=reverse+"and "+string[i]+".";
			else
				reverse=reverse+string[i]+",";
		}
		return reverse;
	}
	
	/**
	 * Purpose: Different operations on integers.
	 * 
	 * @param firstNumber First number to be added
	 * @param secondNumber Second number to be added
	 * @param thirdNumber Third number to be added
	 */
	public void intOperation(int firstNumber,int secondNumber,int thirdNumber) {
		int result1, result2,result3,result4;
		result1=firstNumber+secondNumber*thirdNumber;
		result2=firstNumber*secondNumber+thirdNumber;
		result3=thirdNumber+firstNumber/secondNumber;
		result4=firstNumber+secondNumber%thirdNumber;
		System.out.println("a+b*c: "+result1+"\na*b+c: "+result2+"\nc+a/b: "+result3+"\na%b+c: "+result4);
		
	}
	
	/**
	 * Purpose: Different operations on doubles.
	 * 
	 * @param 	firstNumber		First number to be added.
	 * @param 	secondNumber	Second number to be added.
	 * @param 	thirdNumber		Third number to be added.
	 */
	public void doubleOperations(double firstNumber,double secondNumber,double thirdNumber) {
		double result1, result2,result3,result4;
		result1=firstNumber+secondNumber*thirdNumber;
		result2=firstNumber*secondNumber+thirdNumber;
		result3=thirdNumber+firstNumber/secondNumber;
		result4=firstNumber+secondNumber%thirdNumber;
		System.out.println("a+b*c: "+result1+"\na*b+c: "+result2+"\nc+a/b: "+result3+"\na%b+c: "+result4);
		
	}
	
	/**
	 * Purpose:Determine year is leap year or not.
	 * 
	 * @param 	year 	year to be added.
	 * @return	true	Given year is leap year.
	 * 			false	Given year is not leap year.
	 */
	public static boolean leapYear(int year) {
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) 
					return true;
				else
					return false;
			}
			else 
				return true;
		}
		else
			return false;
	}
	
	/**
	 * Purpose: Determine day  of month  is between March 20 and June 20.
	 * 
	 * @param 	day		day to be added.
	 * @param 	month	month to be added.
	 * @return	true	If date is between March 20 and June 20.
	 * 			false	If date is between March 20 and June 20
	 */
	public boolean springSeason(int day, int month) {
		if(month>=3&&month<=6) {
			if(month==3&&day>=20&&day<=31)
				return true;
			else if(month==4&&day<=30)
				return true;
			else if(month==5&&day<=31)
				return true;
			else if(month==6&&day<=20)
				return true;
			else 
				return false;
		}
		else
			return false;
	}

	/**
	 * Purpose: Calculated root of quadratic equation.
	 * 
	 * @param 	firstNumber		First number to be add.
	 * @param 	secondNumber	Second number to be add.
	 * @param 	thirdNumber		Third number to be add.
	 */
	public void quadraticEquation(double firstNumber, double secondNumber, double thirdNumber) {
		double delta,root1, root2;
		delta=secondNumber*secondNumber-4*firstNumber*thirdNumber;
		if(delta>0) {
			root1=(-secondNumber + Math.sqrt(delta))/(2*firstNumber);
			root2=(-secondNumber - Math.sqrt(delta))/(2*firstNumber);
			System.out.println("Root1: "+root1+"\n Root2: "+root2);
		}
		else if(delta==0) {
			root1=root2=-secondNumber/(2*firstNumber);
			System.out.println("Root1: "+root1+"\n Root2: "+root2);
		}
		else {
			root1=-secondNumber/(2*firstNumber);
			root2=Math.sqrt(-delta)/(2*firstNumber);
			System.out.format("Root1 : %.2f+%.2fi \n Root2: %.2f-%.2fi ",root1,root2,root1,root2);
		}
		
	}
	
	/**
	 * Purpose: Sum of two dice.
	 * 
	 * @param 	dice1	First dice integer add.
	 * @param 	dice2	Second dice integer add.
	 * @return	sum		Sum of two dices integers
	 */
	public int sumOfTwoDice(int dice1,int dice2) {
		int sum=dice1+dice2;
		return sum;
	}
	
	/**
	 * Purpose: Calculate Euclidean distance from the point (x, y) to the origin (0, 0).
	 * 
	 * @param 	coordinateX		Coordinate x of point(x,y).
	 * @param 	coordinateY		Coordinate x of point(x,y).
	 * @return	distance		Distance between two points.
	 */
	public static double distanceBetPoints(int coordinateX,int coordinateY) {
		double distance=Math.sqrt(Math.pow(coordinateX, 2)+Math.pow(coordinateY, 2));
		return distance;
	}
	
	public static void stats5(double number1,double number2,double number3,double number4,double number5) {
		System.out.println("Average of 5 number: "+(number1+number2+number3+number4+number5)/5);
		System.out.println("Maximum number : "+Math.max(number1, Math.max(number2, Math.max(number3, Math.max(number4, number5)))));
		System.out.println("Minimum number : "+Math.min(number1, Math.min(number2, Math.min(number3, Math.min(number4, number5)))));
	}
	
	/**
	 * Purpose: To calculate given temperature in effective by the rule NWS.
	 * 
	 * @param 	tempreture 	Temperature is add.
	 * @param 	speed		Wind speed is add.
	 * @return	wind		Return effective temperature
	 */
	public double windChill(double tempreture,double speed) {
		double wind=35.74+0.6215*tempreture+(0.4275*tempreture-35.75)*Math.pow(speed, 0.16);
		return wind;
	}
	
	/**
	 * Purpose: To find the day of week.
	 * 
	 * @param 	day		Given the day in date to be add.
	 * @param 	month	Given month to be add
	 * @param 	year	Given year to be add.
	 * @return	day		Return the day.
	 */
	public int dayOfWeek(int day, int month,int year) {
		int temp,tempYear,tempMonth,tempDay;
		tempYear= year-(14-month)/12;
		temp=tempYear +tempYear/4-tempYear/100 +tempYear/400;
		tempMonth= month + 12 *((14 -month)/12)-2;
		tempDay=(temp+day+(31*tempMonth)/12);
		day=Math.floorMod(tempDay, 7);
		return day;
	}
	
	/**
	 * Purpose: Temperature convert celsius to fahrenheit and vice-verse.
	 * 
	 * @param 	tempreture	given temperature is add.
	 * @param 	choice		celsius to fahrenheit and vice-versa selected is add
	 * @return	fahrenheit	Return temperature is convert into fahrenheit.
	 * 			celsius		Return temperature is convert into celsius.
	 */
	public double tempretureConversion(double tempreture,int choice) {
		if(choice==1) {
			double fahrenheit=(tempreture*9/5) + 32;
			return fahrenheit;
		}
		else {
			double celsius=(tempreture -32) * 5/9;
			return celsius;
		}
	}
	
	/************************************************
	 * Purpose : Find compound interest on the loan.
	 * 
	 * @param 	principal	car loan ammount.
	 * @param 	rate		interest rate.
	 * @param 	year		Y years to pay off
	 * @return	payment		Return ammount including compound interest.
	 */
	public double carLoan(int principal,double rate,int year) {
		double payment=(principal*(rate/(12*100)))/(1-(Math.pow(1+(rate/(12*100)), -year)));
		return payment;
	}
	
	/**
	 * Purpose: Perform different trignometric function.
	 * 
	 * @param 	angle	Angle is add.
	 */
	public static void trigonometric(double angle) {
		System.out.format("value of angle in sin: %.2f",Math.sin(angle));
		System.out.format("\nvalue of angle in cos: %.2f",Math.cos(angle));
		System.out.format("\nvalue of angle in tan: %.2f",Math.tan(angle));
		System.out.format("\nvalue of angle in cosec: %.2f",1/Math.sin(angle));
		System.out.format("\nvalue of angle in sec: %.2f",1/Math.cos(angle));
		System.out.format("\nvalue of angle in cot: %.2f",1/Math.tan(angle));
	}

	/***************************************************
	 * Purpose: Solution of gambler.
	 * 
	 * @param stack			add stack value.
	 * @param goal			add goal value.
	 * @param numberOfTime	add no of trials
	 */
	public void gambler(int stack,int goal,int numberOfTime) 
	{
		int bet=0;
		int win=0;
		for(int i=0;i<numberOfTime;i++) 
		{
			int cash=stack;
			while(cash > 0 && cash < goal) 
			{
				bet++;
				if(Math.random()<0.5)
				{
					cash++;
					
				}
				else
				{
					cash--;
				}
			}
			if(cash==goal) 
			{
				win++;
			}
			
		}
		System.out.println("No of bet "+bet);
		System.out.println(win+"win of "+numberOfTime);
		System.out.println("Percentage of win"+(win*100/numberOfTime));
		System.out.println("Percentage of Loss"+((numberOfTime-win)*100/numberOfTime));
	}
	
	/**
	 * Purpose: Coin flip and calculate percentage of Head vs Tail.
	 * 
	 * @param 	numberOfFlip	No of times coin flip.
	 */
	public static void flipCoin(int numberOfFlip) {
		int head=0,tail=0;
		for(int i=1;i<=numberOfFlip;i++){
			Random random=new Random();
			int coin=(int)random.nextInt(1+1)+0;
			if(coin==1) {
				System.out.println("Coin Flip "+i+" :head");
				head++;
			}
			else {
				System.out.println("Coin Flip "+i+" :tail");
				tail++;
			}	
		}
		System.out.println("Head: "+head+" Tail:  "+tail+"\nPercentage of head vs tail:"+(head/tail*100));	
	}
	
	/**
	 * @param 	range	range to be add.
	 */
	public static void powerOf2(int range) {
		System.out.println("power of 2: ");
		for(int i=1;i<=range;i++) {
			System.out.print((int)Math.pow(2,i)+" ");
		}
	}
	
	/**
	 * @param 	number	Upto this number the harmonic number will be print.
	 * @return 
	 */
	public static double harmonicNumber(int number) {
		double sum=1;
		String string="1/1";
		for(int i=2;i<=number;i++) {
            string=string+"+"+"1/"+i;
			sum =sum+ 1.0 / i;
			
		}
		System.out.println("Harmonic Number: "+string);
		return sum;
	}
	
	/**
	 * Purpose: To calculate prefect square root of the given number.
	 * 
	 * @param 	number	number to be add.
	 * @return	temp	return square root of the number.
	 */
	public double squareRoot(double number) {
		double epsilon=1e-15;
		double temp=number;
		while(Math.abs(temp - number/temp) > epsilon*temp) {
			temp=(number/temp+temp)/2.0;
		}
		return temp;
	}
	
	/**
	 * Purpose: To print all prime number between the range.
	 * 
	 * @param 	lowerLimit	To start prime number to lower limit.
	 * @param 	upperLimit	To end prime number to upper limit.
	 */
	public void primeNumber(int lowerLimit,int upperLimit) {
		String primeno="";
		for(int i=lowerLimit;i<=upperLimit;i++) {
			int count=0;
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					count=count+1;
					break;
				}
			}
			if(count==0) {
				primeno=primeno+i+" ";
			}
		}
		System.out.println("Prime numbers between "+lowerLimit+" to "+upperLimit+"\n"+primeno);
	}
	
	/**
	 * Purpose: To convert decimal number to binary number.
	 * 
	 * @param	 number		Decimal number to add.
	 */
	public static String decimalToBinary(int number) {
		System.out.println("Decimal to binary conversion: ");
		int array[]=new int[32];
		String string="";
		int i=0;
		while(number>0) {
			array[i]=number%2;
			number=number/2;
			i++;
		}
		for(int j=i-1;j>=0;j--) {
			string=string+array[j];
		}
		return string;
		
	}
	
	/**
	 * @param 	angle	sin angle
	 * @return	sum		sum of taylor series.
	 */
	public static double sin(double angle) {
		angle = angle % (2 * Math.PI);
		
        double term = 1.0;      // ith term = x^i / i!
        double sum  =0.0;      // sum of first i terms in taylor series

        for (int i = 1; term != 0.0; i++) {
        	term *= (angle / i);
            if (i % 4 == 1) sum += term;
            if (i % 4 == 3) sum -= term;
		}
		return sum;
	}
	
	/**
	 * @param 	angle	Cos angle to be add.
	 * @return	sum		Return sum of taylor series. 
	 */
	public static double cos(double angle) {
		angle = angle % (2 * Math.PI);
        double term = angle;      // ith term = x^i / i!
        double sum  = 1.0;      // sum of first i terms in taylor series

        for (int i = 2; term != 0.0; i++) {
        	
        	term *= (angle / i);
            if (i % 4 == 2) sum -= term;
            if (i % 4 == 0 ) sum += term;
		}
		return sum;
	}

	/**
	 * Purpose: To convert decimal to binary number and swap nibbles and calculate new decimal number.
	 * @param 	number	input decimal number
	 */
	public int binarySwap(int number) {
		//Decimal to binary conversion method
		String string=decimalToBinary(number);
		
		System.out.println("Binary number: "+string);
		int stringToInt=Integer.parseInt(string); 
		string=String.format("%08d",stringToInt);
		int length=string.length();
		String [] splits=new String[2];
		splits[0] = string.substring(0,length/2);
		splits[1] = string.substring(length/2,length);
		
		System.out.println(splits[0]); 
		System.out.println(splits[1]);  
		
		String newString=splits[1].concat(splits[0]);
		int binaryNumber=Integer.parseInt(newString);
		System.out.println("New binary number: "+binaryNumber);
		int digit=0,decimalNumber=0,i=0;
		while(binaryNumber>0) {
			digit=binaryNumber%10;
			binaryNumber=binaryNumber/10;
			decimalNumber=decimalNumber+(digit*(int)Math.pow(2, i));
			i++;
		}
		return decimalNumber;
	}
	
	/**
	 *  Purpose: calculate most frequent number.
	 *  
	 * @param 	length	length of given array.
	 * @param 	arrays	random number store in array.
	 */
	public void rollDie(int length,int arrays[]) {
		Arrays.sort(arrays);
        int maxCount=0,result=arrays[0],currentCount=0;
        for(int i = 1; i < length; i++)
        {
        	if(arrays[i]==arrays[i-1]) {
				currentCount++;
			}
			else {
				if(currentCount>maxCount) {
					maxCount=currentCount;
					result=arrays[i-1];
				}
				currentCount=1;
			}
			if(currentCount>maxCount) {
				maxCount=currentCount;
				result=arrays[i-1];
			}
		}
		System.out.println(result);
        
		
	}
	
	/**
	 * Purpose: Find duplicate number in given array.
	 * 
	 * @param 	array	given array
	 * @return	array[]	return duplicate number
	 */
	public void duplicateNumber(int[] array) {
		Arrays.sort(array);
		int length=array.length;
		if(array[0]==array[1])
			System.out.print(" "+array[0]);
		for(int i=1;i<length;i++) {
			if(array[i]==array[i-1]&&array[i]==array[i+1]) {
				System.out.print(" "+array[i]);
			}
		}
		if(array[length-2]==array[length-1])
			System.out.print(" "+array[length-1]);
	}
	
	/**
	 * Purpose: Find second largest and smallest number in array.
	 * 
	 * @param length	length of given array.
	 * @param arrays	given array.
	 */
	public void secondNumber(int length,int arrays[]) {
		int first,second;
		first=second=arrays[0];
		for(int i=0;i<length;i++) {
			if(arrays[i]>first) {
				second=first;
				first=arrays[i];
			}
			else if(arrays[i]>second&&arrays[i]!=first) {
				second=arrays[i];
			}
		}
		if(first<second)
			System.out.println("Second largest number: "+first);
		else
			System.out.println("Second largest number: "+second);
		
		for(int i=0;i<length;i++) {
			if(arrays[i]<first) {
				second=first;
				first=arrays[i];
			}
			else if(arrays[i]<second&&arrays[i]!=first) {
				second=arrays[i];
			}
		}
		if(first>second)
			System.out.println("Second smallest number: "+first);
		else
			System.out.println("Second smallest number: "+second);
	}
	
	/**
	 *  Purpose: Calculate prime factor of given number.
	 * @param 	number	number to be add.
	 */
	public void primeFactor(int number) {
		System.out.println("Prime factor of number: ");
		for(int i = 2; i*i<=number; i++) {
	         while(number%i == 0) {
	            System.out.println(i+" ");
	            number = number/i;
	         }
	      }
	}
	
	/**
	 * Purpose: To determine string is anagram or not.
	 * @param 	string1		first string to be add.
	 * @param 	string2		second string to be add.
	 * @return	boolean		return true if string is anagram else false
	 */
	public static boolean anagram(String string1, String string2) {
		 boolean status = true;  
	        if (string1.length() != string2.length()) {  
	            status = false;  
	        } else {  
	            char[] ArrayS1 = string1.toLowerCase().toCharArray();  
	            char[] ArrayS2 = string2.toLowerCase().toCharArray();  
	            Arrays.sort(ArrayS1);  
	            Arrays.sort(ArrayS2);  
	            status = Arrays.equals(ArrayS1, ArrayS2);  
	        }  
	        if (status) {   
	            return true;
	        } else {   
	            return false;
	        }  
	        
	}
	
	/**
	 * Purpose: To determine string is palindrome or not.
	 * @param 	string	string to be add.
	 * @return	return 	true if string is palindrome else false
	 */
	public static boolean palindromeString(String string) {
		String reverse="";
		for(int i=string.length()-1;i>=0;i--) {
				reverse=reverse+string.charAt(i); }
		if(string==reverse)
			return true;
		else 
			return false;
		
	}
	
	/**
	 * Purpose: To perform permutation of given string using recursion method .
	 * @param 	string	string to be add.
	 * @param 	l		first index of string to add.
	 * @param 	r		last index of string to add.
	 */
	public static void recursionMethod(String string,int l,int r) {
		
		if(l==r)
			System.out.println(string);
		else{
			for(int i=l;i<string.length();i++) {
				string=swap(string,l,i);
				recursionMethod(string,l+1,r);
			}
		}
		
	}

	private static String swap(String newString, int i, int j) {
		char temp;
		char[] charArray=newString.toCharArray();
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
	}
	
	/**
	 * Purpose: To find Day Of Week for given a date .
	 * @param 	day		Given the day in date to be add.
	 * @param 	month	Given month to be add
	 * @param 	year	Given year to be add.
	 * @return	day		Return the day.
	 */
	public static String calendar(int day, int month, int year) {
		int temp,tempYear,tempMonth,tempDay;
		tempYear= year-(14-month)/12;
		temp=tempYear +tempYear/4-tempYear/100 +tempYear/400;
		tempMonth= month + 12 *((14 -month)/12)-2;
		tempDay=(temp+day+(31*tempMonth)/12);
		day=Math.floorMod(tempDay, 7);
		String[] arrays= {"Sunday","Monday","Tuesday","Wednsday","Thurdsday","Friday","Saturday",""};
		
		if(day==1)
			return arrays[1];
		else if(day==2)
			return arrays[2];
		else if(day==3)
			return arrays[3];
		else if(day==4)
			return arrays[4];
		else if(day==5)
			return arrays[5];
		else if(day==6)
			return arrays[6];
		else if(day==0)
			return arrays[0];
		else
			return arrays[7];
	}
	
	/**
	 * Purpose: To print Calendar of the month .
	 * @param 	day		Given the day in date to be add.
	 * @param 	month	Given month to be add
	 * @param 	year	Given year to be add.
	 */
	public static void calendarDates(int day,int month, int year) {
		Utility utility=new Utility();
		int date=utility.dayOfWeek(day, month, year);
		boolean leapYear=Utility.leapYear(year);
		String [] months= {"","January","February","March","April","May","June","July","August","September","October","November","December"};
		int [] days= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if (month==2&&leapYear==true)
			days[2]=29;
		System.out.println("  "+months[month]+" "+year);
		System.out.println(" S  M Tu  W Th  F  s");
		for(int i=0;i<date;i++) 
			System.out.print("  ");
		for(int i=1;i<=days[month];i++) {
			System.out.printf("%2d ",i);
			if(((i+date)%7==0) ||(i==days[month]))
				System.out.println();
		}
	}
	
	/**
	 * Purpose: To calculate factorial of given number.
	 * @param 	number		number to be add.
	 * @return	factorial	return factorial of number.
	 */
	public static long factorial(int number) {
		int factorial=1;
		for(int i=1;i<=number;i++) {
			factorial=factorial*i;
		}
		return factorial;	
	}
	
	/**
	 * Purpose: To determine number is prime or not.
	 * @param 	number	number to be add.
	 * @return			return true if string is anagram else false
	 */
	public static boolean isPrime(int number) {
		int count=0;
		
		for(int i=2;i<=number-1;i++) {
			if(number%i==0) {
				count=count+1;
				break;
			}
		}
		if(count==0)
			return true;
		else
			return false;
	}
	
	/**
	 * Purpose: To calculate future value.
	 * @param 	principal	amount to be add.
	 * @param 	rate		rate to be add.
	 * @param 	year		year to be add.
	 * @return	futureValue	return future Value.
	 */
	public static double futureValue(int principal,int rate,int year) {
		double futureValue=principal*Math.pow(1+rate, year);
		return futureValue;
	}

	/**
	 * Purpose: To calculate present value.
	 * @param 	principal	amount to be add.
	 * @param 	rate		rate to be add.
	 * @param 	year		year to be add.
	 * @return	prsentValue	return present Value.
	 */
	public static double prsentValue(int principal,int rate,int year) {
		double prsentValue=principal/Math.pow(1+rate, year);
		return prsentValue;
	}
	
	/**
	 * Purpose: To find minimum value.
	 * @param 	array	array element to be add.
	 * @return	maximum	return maximum value.
	 */
	public static int maximumValue(int[] array) {
		int length=array.length;
		int maximum=array[0];
		for(int i=0;i<length;i++) {
			if(array[i]>maximum) {
				maximum=array[i];
			}
		}
		return maximum;
	}
	
	/**
	 * Purpose: To find minimum value.
	 * @param 	array	array element to be add.
	 * @return	minimum	return minimum value.
	 */
	public static int minimumValue(int[] array) {
		int length=array.length;
		int minimum=array[0];
		for(int i=0;i<length;i++) {
			if(array[i]>minimum) {
				minimum=array[i];
			}
		}
		return minimum;
	}
	
	/**
	 * Purpose: to check slope is colliner or not .
	 * @param 	array	slope coordinates to be added.
	 * @return	result	return result of collinear.
	 */	
	public static boolean checkCollinearUsingSlope(int []array) {
		double SlopeAB =(array[3]-array[1])/(array[2]-array[0]);
		double SlopeBC =(array[5]-array[3])/(array[4]-array[2]);
		double SlopeAC =(array[3]-array[5])/(array[2]-array[4]);
		if(SlopeAB==SlopeBC&&SlopeBC==SlopeAC)
			return true;
		else 
			return false;
	}
	
	/**
	 * Purpose: to check triangle is colliner or not using area.
	 * @param 	array	triangle coordinates to be added.
	 * @return	result	return result of collinear.
	 */
	public static boolean checkCollinearUsingArea(int []array) {
		double result=1/2*Math.abs(((array[0]-array[2])*(array[3]-array[5]))-((array[2]-array[4])*(array[1]-array[3])));
		if(result==0)
			return true;
		else 
			return false;
	}
	
	          /***************************String and Array*****************************/
	/**
	 * Purpose: To search the string in given string array.
	 * @param 	string	string element to add.
	 * @param 	search	search string to be add.
	 * @return	mid		return position of search string.
	 */
	public static int  binarySearchString(String[] string,String search) {
		for(int i=0;i<string.length;i++) {
			System.out.println(string[i]);
		}
		int firstindex=0;
		int lastindex=string.length-1;
		while(firstindex<=lastindex) {
			int mid=firstindex+(lastindex-firstindex)/2;
			int result=search.compareTo(string[mid]);
			if(result==0)
				return mid;
			if(result>0)
				firstindex=mid+1;
			else
				lastindex=mid-1;
		}
		return -1;
	}
	
	/**
	 * @param 	array	element to be add.
	 */
	public static void bubbleSort(int []array) {
		int temp=0,length=array.length;
		for(int i=0;i<length-1;i++) {
			for(int j=0;j<length-i-1;j++) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		for(int i=0;i<length;i++) {
			System.out.print(" "+array[i]);
		}
	}
	
	public static String[] mergeSortForString(String[] list)  {
		 String [] sorted = new String[list.length];
	        if (list.length == 1) {
	            sorted = list;
	        } 
	        else {
	            int mid = list.length/2;
	            String[] left = null; 
	            String[] right = null;
	            if ((list.length % 2) == 0) {
	                left = new String[list.length/2];
	                right = new String[list.length/2];
	            } 
	            else { 
	                left = new String[list.length/2];
	                right = new String[(list.length/2)+1];
	            }
	            int x=0;
	            int y=0;
	            for ( ; x < mid; x++) {
	                left[x] = list[x];
	            }
	            for ( ; x < list.length; x++) {
	                right[y++] = list[x];
	            }
	            left = mergeSortForString(left);
	            right = mergeSortForString(right);
	            sorted = merge(left,right);
	        }
		return sorted;
	}
	

	public static String[] merge(String[] left, String[] right) {
		 String[] merged = new String[left.length+right.length];
	        int lIndex = 0;
	        int rIndex = 0;
	        int mIndex = 0;
	        int comp = 0;
		while (lIndex < left.length || rIndex < right.length) {
            if (lIndex == left.length) {
                merged[mIndex++] = right[rIndex++];
            } else if (rIndex == right.length) {
                merged[mIndex++] = left[lIndex++];
            } else {  
                comp = left[lIndex].compareTo(right[rIndex]);
                if (comp > 0) {
                    merged[mIndex++] = right[rIndex++];
                } else if (comp < 0) {
                    merged[mIndex++] = left[lIndex++];
                } else { 
                    merged[mIndex++] = left[lIndex++];
                }
            }   
        }
		return merged;
	}
	
	public static void magicNumber(int key,int start,int end,int iteratioin) {
		int []array=new int[end];
		for(int i=start;i<end;i++) {
			array[i]=i;
		}
		Scanner scanner=new Scanner(System.in);
		
		end=end-1;
		int count=0;
		String choice="n";
		 int mid = (start + end)/2;  
		 while( start <= end&&count==iteratioin ){
			 switch(choice) {
			 case "n":
				 if ( array[mid] < key ){  
					 start = mid + 1;     
				 }
				 else if ( array[mid] == key ){  
					 System.out.println("Element is found at index: " + mid);  
					 break;  
				 }
				 else{  
					 end = mid - 1;  
				 }  
				 mid = (start + end)/2;   
				 System.out.println("It your search number? (y/n)");
				 choice=scanner.nextLine();
			 case "y":
				 break;
			 }
			
			 count++;
		 }  
		 if ( start > end ){  
			 System.out.println("Element is not found!");  
		 }
		 scanner.close();
	}
	
	public static void frequencyCount(String[] array) {
		Arrays.sort(array);
		int count=1;
		int length=array.length;
		for(int i=0;i<length;i++) {
			if(array[i]==array[i+1]) {
				count++;
			}
			else {
				System.out.println(array[i]+"\t"+count);
				count=1;
			}
		}
	} 
}