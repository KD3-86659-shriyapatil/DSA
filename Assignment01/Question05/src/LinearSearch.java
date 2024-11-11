import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int arr[],int key,int n) {
    	int count =0;
    	
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]==key) {
    		count ++;
    		
    		if(count == n) {
    		return i;
    		}
    		}
    	}return -1;
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]= {1,2,5,4,5,6,3,8,5};
		System.out.println("Enter key -");
		int key =sc.nextInt();
		System.out.println("Occurrence-");
		int n =sc.nextInt();
		
		int index= linearSearch(arr,key,n);
			if(index == -1)
				System.out.println("value not found");
			else
				System.out.println("the" +" "+n+ "th occurrence of"+" " + key +" "+"is at index-"+index);
		}

	}


