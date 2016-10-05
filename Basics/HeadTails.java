/*
*@file name: HeadTails.java
*@Created By: Prathmesh
*@Date: 06-09-2016
*@purpose: To find probability of head and tails.
*/
package com.brigdelabz.programs;

import com.bridgelabz.util.Utility;

public class HeadTails {

	public static void main(String[] args) {
		int num,count0=0,count1=0,temp;
		double val,h,t;
		
		Utility u = new Utility();
		System.out.print("Enter number of times to flip a coin: ");
		num = u.inInt();
		temp=num;
		
		while(temp>0){
			val= u.random();   	
			if(val>0.5)
				count1++;
			else
				count0++;
			temp--;	
		}
		
		h=(double)count1/num;
		t=(double)count0/num;
		System.out.println(" Heads = "+ (h*100.0));
		System.out.println(" Tails = "+ (t*100.0));

	}

}
