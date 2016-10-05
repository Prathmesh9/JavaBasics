/*
*@file name: Utility.java
*@Created By: Prathmesh
*@Date: 06-09-2016
*@purpose: Unorder list class
*/
package com.brigdelabz.programs.UnOrderedList;

public class UnOrderedList {
	NodeStr head,temp,cur;	
	int numList=0;
		
	public void add(String s){
		temp=new NodeStr(s);
		if(isEmpty()){
			this.head=temp;
		}else{
			cur=this.head;
			while(cur.getNext()!=null){
				cur=cur.getNext();
			}
			if(cur==head){
				head.setNext(temp);
			}else{
				cur.setNext(temp);
				}
		}
		numList++;
	}
	
	public void addPos(String s, int pos){
		temp=new NodeStr(s);
		NodeStr prev=this.head;
		int count=0;
		if (pos==1){
			temp.setNext(this.head);
			head=temp;
		}else if(pos<numList){
			while(count<pos-1 && cur.getNext()!=null){
				count++;
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
			//temp=cur.getNext();
			//cur.setNext(temp);
			//numList++;
		}
		else System.out.println("Position is greater than total size");
	}

	public void remove(String s){
		NodeStr prev=this.head; 
		cur=this.head;
		while(s.compareToIgnoreCase(cur.getStr())!=0 && cur.getNext()!=null){
			prev=cur;
			cur=cur.getNext();
		}
		if(cur==head){
			head=cur.getNext();
		}else{
		prev.setNext(cur.getNext());
		}
		numList--;
		System.out.println("Removed element is : "+cur.str);			
	}
	
	public String pop(){
		NodeStr prev=this.head; 
		cur=this.head;
		while(cur.getNext()!=null){
			prev=cur;
			cur=cur.getNext();
		}
		prev.setNext(null);
		return cur.getStr();
	}

	public boolean search(String s){
		cur=this.head;
		while(s.compareToIgnoreCase(cur.getStr())!=0 && cur.getNext()!=null){
			cur=cur.getNext();
		}
		if(s.compareToIgnoreCase(cur.getStr())==0) return true;
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
	
	public void append(String s){
		cur=this.head;
		temp=new NodeStr(s);
		while(cur.getNext()!=null){
			cur=cur.getNext();
		}
		cur.setNext(temp);
	}
	
	public int indexof(String s){
		cur=this.head;
		int count=0;
		while(s.compareToIgnoreCase(cur.getStr())!=0 && cur.getNext()!=null){
			count++;
			cur=cur.getNext();
		}
		if(s.compareToIgnoreCase(cur.getStr())==0 && count<numList) return count+1;
		return 0;
	}
	
	public void print(){
		NodeStr temp=this.head;
		System.out.println("List : ");
		while(temp!=null){
			System.out.println(temp.str);
			temp=temp.getNext();
		}
	}

	
	private boolean isEmpty() {
		if (this.head!=null)
			return false;
		else return true;
	}

}
