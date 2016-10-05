/*
*@file name: Utility.java
*@Created By: Prathmesh
*@Date: 06-09-2016
*@purpose: Node class
*/
package com.brigdelabz.programs.UnOrderedList;

public class NodeStr {
	String str;
	NodeStr next;
	
	public NodeStr(String s){
		this.str=s;
		this.next=null;
	}
		
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public NodeStr getNext() {
		return next;
	}
	public void setNext(NodeStr next) {
		this.next = next;
	}
}
