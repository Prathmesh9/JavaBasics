/*
*@file name: Triple.java
*@Created By: Prathmesh
*@Date: 06-09-2016
*@purpose: To find triples in given array.
*/
package com.brigdelabz.programs;


import com.bridgelabz.util.Utility;

public class Triple {

	public static void main(String[] args) {
		int row,m,n,k,count = 0;	
		Utility u = new Utility();
		System.out.print("Enter number of elements: ");
		row = u.inInt();
		int [] i = new int[row];
		System.out.println("Enter values in array:");
		for(m=0;m<row;m++)
			i[m]=u.inInt();
		System.out.println("Triples are ");
		for(m=0;m<row;m++)
			for(n=0;n<row;n++)
				for(k=0;k<row;k++){
					if(i[m]+i[n]+i[k]==0){
						count++;
						System.out.println(" "+i[m]+" "+i[n]+" "+i[k]);
					}
				}
		if(count<1) System.out.println("No triples found");
		else System.out.println("Number of triples : "+ count);
	}

}
