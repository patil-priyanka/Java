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

import java.util.Random;

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
	public boolean leapYear(int year) {
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
	 */
	public static void harmonicNumber(int number) {
		double sum=1;
		String string="1/1";
		for(int i=2;i<=number;i++) {
            string=string+"+"+"1/"+i;
			sum =sum+ 1.0 / i;
			
		}
		System.out.println("Harmonic Number: "+string);
		System.out.println("Sum of harmonic number: "+sum);
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
	public void decimalToBinary(int number) {
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
		System.out.println(string);
		int stringToInt=Integer.parseInt(string); 
		string=String.format("%032d",stringToInt);
		System.out.println(string);
	}
	
	/**
	 * @param 	angle	sin angle
	 * @return	sum		sum of taylor series.
	 */
	public double sin(double angle) {
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
	
	public double cos(double angle) {
		angle = angle % (2 * Math.PI);
		
        double term = 1.0;      // ith term = x^i / i!
        double sum  = 0.0;      // sum of first i terms in taylor series

        for (int i = 1; term != 0.0; i++) {
        	term *= (angle / i);
            if (i % 4 == 2) sum += term;
            if (i % 4 == 4) sum -= term;
			i=i+2;
		}
		return sum;
	}

	public void binarySwap(int number) {
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
			string=string+""+array[j];
		}
		int stringToInt=Integer.parseInt(string); 
		string=String.format("%08d",stringToInt);
		System.out.println(string);
		String[] parts = string.split("",4);
		String string1 = parts[0];
		String string2 = parts[1];
		//System.out.println(split());
		System.out.println(string1);  // prints name1
		System.out.println(string2);  // prints name2, name3, name4
	}
}