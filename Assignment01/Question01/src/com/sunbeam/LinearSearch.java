package com.sunbeam;

import java.util.Scanner;

public class LinearSearch {
   public static int linearSearch(int arr[],int key) {
	   int count = 0;
	   for(int i=0;i<arr.length;i++) {
		  count ++;
		  if(arr[i]==key)
			  return i;
	   }
	   return -1;
   }
   
   public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter key to be searched-");
	int key=sc.nextInt();
	
	int index=linearSearch(arr,key);
	if(index == -1)
		System.out.println("key is found");
	else
		System.out.println("key is found-"+index);
	
	sc.close();
}
}
