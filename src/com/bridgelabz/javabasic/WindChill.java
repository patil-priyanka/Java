package com.bridgelabz.javabasic;

import com.bridgelabz.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		double tempreture=Double.parseDouble(args[0]);
		double speed=Double.parseDouble(args[1]);
		System.out.println("Tempreture: "+tempreture+"Speed: "+speed);
		Utility utility=new Utility();
		if(Math.abs(tempreture)>50||speed>120||speed<3) {
			System.out.println("Enter value in the range 'tempreture<50' and '3<speed<150'");
		}
		else {
			double result=utility.windChill(tempreture, speed);
			System.out.println("WhidChill: "+result);
		}
	}
}
