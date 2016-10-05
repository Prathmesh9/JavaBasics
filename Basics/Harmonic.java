/*
*@file name: Harmonic.java
*@Created By: Prathmesh
*@Date: 06-09-2016
*@purpose: To find nth harmonic.
*/
package com.brigdelabz.programs;

import com.bridgelabz.util.Utility;

public class Harmonic {

	public static void main(String[] args) {
		int i=1,n;
		double total=0;		
		Utility u = new Utility();
		System.out.print("Enter number of harmonics(n): ");
		n = u.inInt();		
		if(n>0){
			while(i<=n){
				if(i>1)
					total=total+(1/(double)i);	
				else
					total=1;
				i++;
			}
		System.out.println(n+"th harmonic = "+total);
		}
		else
			System.out.println("Please enter non-zero number.");
	}

}
