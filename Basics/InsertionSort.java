/*
*@file name: InsertionSort.java
*@Created By: Prathmesh
*@Date: 06-09-2016
*@purpose: To take input string from user and search a string.
*/

package com.brigdelabz.programs;

import com.bridgelabz.util.Utility;

public class InsertionSort {

	public static void main(String[] args) {
		Utility u = new Utility();
		 String str,strarray[];
		 System.out.print("Please enter string : ");
		 str=u.inString();
		 strarray=str.split(" ");
		 strarray=u.insertionSortString(strarray);
		 
		 for(int i= 0;i<strarray.length;i++){
			 System.out.println(strarray[i]);
		 }
		 


	}

}
