/*
*@file name: Username.java
*@Created By: Prathmesh
*@Date: 06-09-2016
*@purpose: To display name.
*/
package com.brigdelabz.programs;

import com.bridgelabz.util.Utility;

public class Username {

	public static void main(String[] args) {
		String name;
		Utility u = new Utility();
		System.out.print("Enter name: ");
		name = u.inString();
		int len = name.length();
		if(len<3)
			System.out.println("Please enter name of minimum 3 characters.");
		else
			System.out.println("Hello "+ name +". How are you?");	

	}

}
