package com.sunbeam;

import java.util.Scanner;

public class binarySearch {
	public static int binarySearch(int arr[],int key) {
		int left=0,right=arr.length,mid,comps=0;
		while(left<=right) {
			comps ++;
			mid = (left+right)/2;
			if(key == arr[mid]) {
				System.out.println("No. of comparision-"+comps);
				return mid;
			}
			else if(key<arr[mid]) {
				right=mid-1;
			}
			else {
				left = mid +1;
		}
		
			}	//System.out.println("No. of comparision-"+comps);
		
		return -1;
	}

	public static void main(String[] args) {
	int arr[]= {10,20,30,40,50,60,70};
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter key to searching-");
	int key=sc.nextInt();
	
	int index = binarySearch(arr,key);
	if(index==-1)
		System.out.println("key is not found");
	else
		System.out.println("key is found");
     sc.close();
	}

}
