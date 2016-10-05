/*
*@file name: OrderedList.java
*@Created By: Prathmesh
*@Date: 10-09-2016
*@purpose: Hashing class main
*/
package com.brigdelabz.programs.OrderedList;

import com.bridgelabz.util.Utility;

public class HashingM {
	public static void main(String [] args) {
		int hash;
		Utility u = new Utility();
		System.out.println("Enter the hash : ");
		hash=u.inInt();
		Hashing h = new Hashing(hash);
		
		for(int i = 1; i<hash*2;i++){
			h.add(i);
		}
		h.print();
	}
}
