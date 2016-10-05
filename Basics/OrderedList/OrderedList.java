/*
*@file name: OrderedList.java
*@Created By: Prathmesh
*@Date: 06-09-2016
*@purpose: Order list class
*/
package com.brigdelabz.programs.OrderedList;

public class OrderedList {
	Node head,temp,cur;	
	int numList=0;
		
	public void add(int s){
		temp=new Node(s);
		Node prev=this.head;
		if(isEmpty()){
			this.head=temp;
		}
		else{
			cur=this.head;
			
			if(temp.getNum()<=head.getNum()){
				temp.setNext(head);
				head=temp;
			}else{
				while(temp.getNum()>cur.getNum() && cur.getNext()!=null){
					prev=cur;
					cur=cur.getNext();
				}
				if(cur.getNext()==null){
					cur.setNext(temp);
					temp.next=null;
					}
				else{
					temp.setNext(prev.getNext());
					prev.setNext(temp);
					}
			}
		}
		numList++;
		//return this.head;
	}
	
	/*public void addPos(int s, int pos){
		temp=new Node(s);
		int count=0;
		if (pos==1){
			temp.next=this.head.getNext();
			head=temp;
		}else{
			while(count<pos && cur.getNext()!=null){
				count++;
				cur.next=cur.getNext();
			}
			temp.next=cur.getNext().getNext();
			cur.next=temp;
			numList++;
		}
	}*/

	public void remove(int s){
		Node prev=this.head; 
		cur=this.head;
		while(s!=cur.getNum() && cur.getNext()!=null){
			prev=cur;
			cur=cur.getNext();
		}
		if(cur==head){
			head=cur.getNext();
		}else{
			prev.next=cur.getNext();
		}
		numList--;
		System.out.println("Removed element is : "+cur.getNum());			
	}
	
	public int pop(){
		Node prev=this.head; 
		cur=this.head;
		while(cur.getNext()!=null){
			prev=cur;
			cur=cur.getNext();
		}
		prev.setNext(null);
		return cur.getNum();
	}

	public boolean search(int s){
		cur=this.head;
		while(s!=cur.getNum() && cur.getNext()!=null){
			cur=cur.getNext();
		}
		if(cur.getNum()==s) return true;
		else return false;
	}
	
	public int size(){
		cur=this.head;
		int count=0;
		while(cur.getNext()!=null){
			count++;
			cur=cur.getNext();
		}
		return count;
	}
	
	/*public void append(int s){
		cur=this.head;
		temp=new Node(s);
		while(!cur.str.equals(s) && cur.getNext()!=null){
			cur.setNext(cur.getNext());
		}
		cur.setNext(temp);
	}*/
	
	public int indexof(int s){
		cur=this.head;
		int count=0;
		while(s!=cur.getNum() && cur.getNext()!=null){
			count++;
			cur=cur.getNext();
		}
		if(cur.getNum()==s && count<numList) return count;
		return 0;
	}
	
	public void print(){
		Node temp=this.head;
		System.out.println("List : ");
		while(temp!=null){
			System.out.println(temp.getNum());
			temp=temp.getNext();
		}
	}
	
	private boolean isEmpty() {
		if (this.head!=null)
			return false;
		else return true;
	}

}
