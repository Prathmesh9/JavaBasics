/*
*@file name: VendingMachine.java
*@Created By: Prathmesh
*@Date: 06-09-2016
*@purpose: To calculate minimum nuber of change for given amount.
*/

package com.brigdelabz.programs;

import com.bridgelabz.util.Utility;

class VendingMachine{
	public static void main(String [] args){
		int amount;		
		Utility u = new Utility();
		System.out.println("Enter amount : ");
		amount=u.inInt();
		VendingMachine m =new VendingMachine();
		int total=m.calChange(amount); 
		System.out.print("Total : "+total);		
	}

	public int calChange(int sum){
		int total=0,n=0;
		if(sum>1000){
			total=sum/1000;
			n=calChange(sum%1000);
			System.out.println("Number of notes of 1000: "+total);
			return total+n; 
		}else if(sum>500){
			total=sum/500;
			n=calChange(sum%500);
			System.out.println("Number of notes of 500: "+total);
			return total+n; 
		}else if(sum>100){
			total=sum/100;
			n=calChange(sum%100);
			System.out.println("Number of notes of 100: "+total);
			return total+n; 
		}else if(sum>50){
			total=sum/50;
			n=calChange(sum%50);
			System.out.println("Number of notes of 50: "+total);
			return total+n; 
		}else if(sum>10){
			total=sum/10;
			n=calChange(sum%10);
			System.out.println("Number of notes of 10: "+total);
			return total+n; 
		}else if(sum>5){
			total=sum/5;
			n=calChange(sum%5);
			System.out.println("Number of notes of 2: "+total);
			return total+n; 
		}else if(sum>2){
			total=sum/2;
			n=calChange(sum%2);
			System.out.println("Number of notes of 1: "+total);
			return total+n; 
		}else if(sum!=0){
			return 1;
		}else return 0;
	}
}
