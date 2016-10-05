/*
*@file name: Utility.java
*@Created By: Prathmesh
*@Date: 06-09-2016
*@purpose: Utility class for data input and common code.
*/

package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Utility {

	BufferedReader br,fr;
	
	
	public Utility(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	//to input string value
	public String inString(){
		try{
			return br.readLine();
		}
		catch(IOException e){
			System.out.println("IOException\n"+e.getMessage());
		}
		return null;
	}
	
	//to input integer value
	public int inInt(){
		try{
			return Integer.parseInt(br.readLine());
		}
		catch(IOException e){
			System.out.println("IOException\n"+e.getMessage());
		}
		return 0;		 
	}
	
	//to input double value
	public double inDouble(){
		try{
			return Double.parseDouble(br.readLine());
		}
		catch(IOException e){
			System.out.println("IOException\n"+e.getMessage());
		}
		return 0;
	}
	
	//to input boolean value
	public boolean inBool(){
		try{
			return Boolean.parseBoolean(br.readLine());
		}
		catch(IOException e){
			System.out.println("IOException\n"+e.getMessage());
		}
		return false;
	}
	
	public String inFile(File f){
		try{
			FileReader fi=new FileReader(f);
			fr=new BufferedReader(fi);
			return fr.readLine();
		}
		catch(IOException e){
			System.out.println("IOException\n"+e.getMessage());
		}
		return null;
	}
	//to sort integers using Bubble Sort
	public int[] bubbleSortInteger(int [] array){
		int temp;
		System.out.println(array.length);
		for(int i=0;i<=array.length-1;i++){
			for(int j=1;j<(array.length-i);j++){
				if (array[j-1]>array[j]) {
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				} 
				System.out.println(i+" "+j);
			}
		}
		return array;
	}
	
	public char[] bubbleSortChar(char [] array){
		char temp;
		for(int i=1;i<array.length;i++)
			for(int j=0;j<array.length-i;j++){
				if (array[j]>=array[j+1]){
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				} 
			}
		return array;
	}
	
	//to sort strings using Bubble Sort
	public String[] bubbleSortString(String [] array){
		String temp;
		for(int i=1;i<array.length;i++)
			for(int j =0;j<array.length-i;j++){
				if (array[j].compareToIgnoreCase(array[j+1])>0) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				} 
			}
		return array;		
	}
	
	//to sort integers using Insertion Sort
	public int[] insertionSortInt(int [] array){
		
		for(int i=1;i<array.length;i++){
			int key=array[i];
			int j=i-1;
			while(((j>=0)&&key<array[j])){
				array[j+1]=array[j];
				j--;
				}
			array[j+1]=key;
			}
		return array;
	}
	
	//to sort strings using Insertion Sort
	public String[] insertionSortString(String [] array){
		for(int i=1;i<array.length;i++){
			String key=array[i];
			int j=i-1;
			while((j>=0)&&(key.compareToIgnoreCase(array[j])<0)){
				array[j+1]=array[j];
				j--;
				}
			array[j+1]=key;
			}
		return array;
	}
	
	public char[] insertionSortChar(char [] array){
		for(int i=1;i<array.length;i++){
			char key=array[i];
			int j=i-1;
			while((j>=0)&&(key<array[j])){
				array[j+1]=array[j];
				j--;
				}
			array[j+1]=key;
			}
		return array;
	}
	
	//to search integer using Binary Search
	public boolean binarySearchInt(int [] array,int number){
		int mid,start=0,end=array.length;
		while(start<=end){
			mid=(start+end)/2;
			if(array[mid]==number)
				return true;
			else if(number<array[mid]) end=mid-1;
			else start=mid+1;
			}	
		return false;
	}
	
	//to search strings using Binary Search
	public boolean binarySearchString(String [] array,String value){
		int mid,start=0,end=array.length;
		while(start<=end){
			mid=(start+end)/2;
			if(value.compareToIgnoreCase(array[mid])==0)
				return true;
			else if(value.compareToIgnoreCase(array[mid])<0) end=mid-1;
			else start=mid+1;
		}
		return false;
	}
	
	//to get current time.
	public long getTime(){
		return System.currentTimeMillis();
	}
		
	public double random(){
		return Math.random();
	}
	
	public int randomInt(int n){
		return ((int)((Math.random()*n)+1));
	}
}
