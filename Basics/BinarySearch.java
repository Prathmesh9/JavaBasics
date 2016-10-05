/*
*@file name: BinarySearch.java
*@Created By: Prathmesh
*@Date: 06-09-2016
*@purpose: To take input string from user and search a string.
*/

package com.brigdelabz.programs;

import com.bridgelabz.util.Utility;

public class BinarySearch {

	public static void main(String[] args) {
		
		 Utility u = new Utility();
		 String str,strarray[];
		 System.out.print("Please enter comma separated string : ");
		 str=u.inString();
		 strarray=str.split(", ");
		 strarray=u.bubbleSortString(strarray);
		 for(int i=0;i<strarray.length;i++){
			 System.out.println(strarray[i]);
		 }
		 System.out.print("Enter string to be searched : ");
		 str= u.inString();
		 boolean f =u.binarySearchString(strarray, str);
		 if (f) {
			System.out.println(str+" is present in given string.");
		} else {
			System.out.println(str+" is not present in given string.");
		}

	}

}
