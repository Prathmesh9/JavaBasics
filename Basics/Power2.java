/*
*@file name: Power2.java
*@Created By: Prathmesh
*@Date: 06-09-2016
*@purpose: To find power of 2.
*/
package com.brigdelabz.programs;

public class Power2 {

	public static void main(String[] args) {
		int i=0,total=0,count = Integer.parseInt(args[0]);
		System.out.println("Number of powers :"+args[0]);
		
		if(count<=30){
			while(i<=count){
				if(i>0)
					total=total*2;	
				else
					total=1;
				System.out.println("2 ^ "+i+" = "+total);
				i++;
			}
		}
		else
			System.out.println("Power is too big to represent.");	
		

	}

}
