/*
*@file name: Anagram.java
*@Created By: Prathmesh
*@Date: 06-09-2016
*@purpose: To check given strings are anagram or not.
*/
package com.brigdelabz.programs;


import com.bridgelabz.util.Utility;

public class Anagram {

	public static boolean anagram(String one, String two){
		char ch1[],ch2[];
		int i=0,count=0;
		Utility u = new Utility();
		ch1=one.toLowerCase().toCharArray();
		ch2=two.toLowerCase().toCharArray();
		if(ch1.length != ch2.length)
			return false;
		else{
		ch1=u.insertionSortChar(ch1);
		ch2=u.bubbleSortChar(ch2);
		for(i=0;i<ch1.length;i++){
			if(ch1[i]==ch2[i])
				count++;
		}
		if(count==ch1.length) 
			return true;
		else return false;
		}
	}

	public static void main(String[] args) {
		String str1,str2;
		Utility u = new Utility();
		System.out.print("Enter string 1:");
		str1 = u.inString();
		System.out.print("Enter string 2:");
		str2 = u.inString();
		boolean b = anagram(str1,str2);
		if(b) System.out.println("Given strings are anagrams");
		else System.out.println("Given strings are not anagrams");

	}

}
