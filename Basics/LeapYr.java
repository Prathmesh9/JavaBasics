/*
*@file name: LeapYr.java
*@Created By: Prathmesh
*@Date: 06-09-2016
*@purpose: To find giver year is Leap year or not.
*/
package com.brigdelabz.programs;

import com.bridgelabz.util.Utility;

public class LeapYr {

	public static void main(String[] args) {
		int yr,d,count = 0;
		
		Utility u= new Utility(); 
		System.out.print("Enter year: ");
		yr = u.inInt();
		d=yr;

        while (d > 0) {
            count++;
            d = (d / 10);
        }
		
		if(count<=4){
			if((yr%4==0 && yr%100!=0) || yr%400==0)
				System.out.println("Year "+ yr+" is a leap year.");
			else
				System.out.println("Year "+ yr+" is not a leap year.");
		}
		else
			System.out.println("Enter valid year.");	

	}

}
