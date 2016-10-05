/*
*@file name: OrderedList.java
*@Created By: Prathmesh
*@Date: 06-09-2016
*@purpose: Order list class main
*/
package com.brigdelabz.programs.OrderedList;

import java.io.File;

import com.bridgelabz.util.Utility;

public class OrderedListM {

	public static void main(String[] args) {
		int i=0;
		Utility u = new Utility();		
		OrderedList o =new OrderedList();
		File f= new File("ordered.txt");
		String str=u.inFile(f);
		System.out.println("File contains : "+str);
		str=str.trim();
		String [] st=str.split(" ");
		for(i=0; i<st.length;i++){
			System.out.print(st[i]+" ");
		}
		System.out.println();
		int [] snum=new int [st.length];
		
		for(i=0; i<st.length;i++){
			snum[i]=Integer.parseInt(st[i]);
		}
		
		for(i=0; i<st.length;i++){
			System.out.print(snum[i]+" ");
		}
		System.out.println();
		for(i=0; i<snum.length;i++){
			o.add(snum[i]);
		}
		o.print();
		System.out.println("Size = " + o.size());
		o.remove(10);
		o.print();
		System.out.println(o.search(5));
		System.out.println(o.indexof(6));
		System.out.println(o.pop());
	}

}
