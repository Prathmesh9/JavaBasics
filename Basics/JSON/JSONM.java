/*
*@file name: JSONM.java
*@Created By: Prathmesh
*@Date: 13-09-2016
*@purpose: To learn concept of JSON
*/

package com.brigdelabz.programs.JSON;


import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONM {
	public static void main(String [] args) {
		int i=0,j=0,total=0;//,w,p;
		Object w,p;
		int pr,we;
		try{
			JSONParser parser=new JSONParser();
			Object obj = parser.parse(new FileReader("document.json"));
			
			JSONObject jobj= (JSONObject)obj;
			JSONArray arr = (JSONArray)jobj.get("Food");
						
			String [] type = {"Rice","Pulses","Wheat"};
			for(i=0;i<arr.size();i++){
				JSONObject item=(JSONObject) arr.get(i);
				JSONArray arr1 = (JSONArray)item.get(type[i]);
				System.out.println("\n\nData : "+"\n"+type[i]);
				for(j=0;j<arr1.size();j++){
					JSONObject sobj=(JSONObject)arr1.get(j);
					w=sobj.get("Weight");
					p=sobj.get("Price");
					pr=Integer.parseInt(p.toString());
					we=Integer.parseInt(w.toString());
					total+=(we*pr);
					System.out.println("Type : "+sobj.get("Type"));
					System.out.println("Weight : "+w);
					System.out.println("Price : "+p);
				}
				System.out.println("Total : "+total);
				System.out.println();
			
			}
			
		}
		catch(IOException e){
			System.out.println("File not found. "+e);
		}
		catch(ParseException e){
			System.out.println("Parse exception. "+e);
		}
		
	}
}
