/*
*@file name: UnorderedList.java
*@Created By: Prathmesh
*@Date: 06-09-2016
*@purpose: Unorder list class main
*/
package com.brigdelabz.programs.UnOrderedList;

import java.io.File;

import com.bridgelabz.util.Utility;

public class UnorderM {

	public static void main(String[] args) {
		Utility u = new Utility();		
		UnOrderedList o =new UnOrderedList();
		File f= new File("Unordered.txt");
		String str=u.inFile(f);
		System.out.println("File contains : "+str);
		str=str.trim();
		String [] st=str.split(" ");
		for(int i=0; i<st.length;i++){
			o.add(st[i]);
		}
		o.print();
		System.out.println("Size = "+o.size());
		System.out.println(o.search("ciao"));
		o.remove("ciao");
		o.append("ciao");
		o.print();
		System.out.println(o.indexof("hi"));
		System.out.println(o.pop());
		o.print();
		o.addPos("bhai-bhai",1);
		o.print();
	}

}
