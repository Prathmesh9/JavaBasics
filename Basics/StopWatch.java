/*
*@file name: StopWatch.java
*@Created By: Prathmesh
*@Date: 06-09-2016
*@purpose: To create stopwatch.
*/
package com.brigdelabz.programs;

import com.bridgelabz.util.Utility;

public class StopWatch {

	public static void main(String[] args) {
		Utility u = new Utility();
		int op=0;
		long sr=0,st=0;
		while(op!=3){
			System.out.print("1.Start\n2.Stop\n3.Exit\nEnter option: ");
			op=u.inInt();
			switch(op){
			case 1: 
				sr=u.getTime();
				break;
			case 2:
				st=u.getTime();
				long t=st-sr; 
				System.out.println("Total time : "+((double)t/1000)+" seconds");
			}
		}
	}

}
