package com.sunbeam;

import java.util.Scanner;

public class linearSearch {
	
//	static int comps = 0;
	public static int linearSearch(int arr[],int key) {
		 int comps = 0;
		for(int i=0;i<arr.length;i++) {
			comps ++;
			if (key == arr[i]) {
				System.out.println("No. of comparison-"+comps);
				return i;
			}
			
			
		}
		
		
		return -1;
		
	}
	

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70};
		
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter key to searching-");
      int key=sc.nextInt();
      
      int index = linearSearch(arr,key);
      if(index==-1) 
	    System.out.println("key is not found");
      else 
    	  System.out.println("Key is found");
      
      //sc.close();
	}
}