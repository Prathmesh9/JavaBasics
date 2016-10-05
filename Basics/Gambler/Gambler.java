/*
*@file name: Gambler.java
*@Created By: Prathmesh
*@Date: 06-09-2016
*@purpose: Back logic of Gambler.
*/
package com.brigdelabz.programs.Gambler;

import com.bridgelabz.util.Utility;

public class Gambler extends Thread {
	private	int stake,goal,nguess;
	private String name;
	Utility u = new Utility();
	
	public Gambler() {
		stake=5;
		goal=10;
		nguess=10;
		name="ABC";
	}
	
	public Gambler(int stake,int goal,int nguess,String name){
		this.stake=stake;
		this.goal= goal;
		this.nguess= nguess;
		this.name= name;
	}
	
	public synchronized void run(){
		
		int guess,ran,loss=0,win=0,bets=0;
		this.setDetails();
		
		while(this.nguess >0 && this.stake >0 && this.stake<this.goal){
			guess=guessNum();
			bets++;
			ran= random();
			if(guess!=ran) {
				loss++ ; 
				this.nguess--;
				this.stake--;
				}
			else {
				win++;
				this.stake++;
				}
		}
		System.out.println("Name:"+this.name);
		if (this.stake==this.goal) System.out.println("You have won :) !!!!");
		else System.out.println("Sorry, you lose :(");
		System.out.println("Number of wins:"+win);
		System.out.println("Number of loss:"+loss);
		System.out.println("Total bets:"+bets);
		
	}
	
	
	public synchronized int guessNum(){
		int num;
		System.out.print("Enter a number between 1-5 : ");
		num= u.inInt();
		return num;
	}
	
	public synchronized int random(){
		int ran=(int)((u.random()*5)+1);
		return ran;
	}
	
	public synchronized void setDetails(){
		System.out.print("Enter name : ");
		this.name=u.inString();
		System.out.print("Enter stake : ");
		this.stake=u.inInt();
		System.out.print("Enter goal : ");
		this.goal=u.inInt();
		System.out.print("Enter numbe rof guess : ");
		this.nguess=u.inInt();
	}
	
}
