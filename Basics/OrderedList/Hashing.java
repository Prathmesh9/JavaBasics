/*
*@file name: Hashing.java
*@Created By: Prathmesh
*@Date: 10-09-2016
*@purpose:Create hash of ordered list.
*/

package com.brigdelabz.programs.OrderedList;

public class Hashing {
	private OrderedList [] mArr;
	private int mhash;
	
	public Hashing(int hash) {
		this.mhash=hash;
		mArr=new OrderedList [mhash];
		for(int i = 0;i<mhash;i++){
			mArr[i]=new OrderedList();
		}
	}
	
	public void add(int num){
		int n = num%mhash;
		this.mArr[n].add(num);
	}
	public void print(){
		for(int i =0;i<mhash;i++){
			System.out.println("List "+i+" : ");
			this.mArr[i].print();
		}
	}

}
