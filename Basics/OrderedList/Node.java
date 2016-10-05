/*
*@file name: Utility.java
*@Created By: Prathmesh
*@Date: 06-09-2016
*@purpose: Node class
*/
package com.brigdelabz.programs.OrderedList;

public class Node {
	int num;
	Node next;
	
	public Node(int s){
		this.num=s;
		this.next=null;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
