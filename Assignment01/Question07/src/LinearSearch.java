import java.util.Scanner;

public class LinearSearch {
     public static int linearSearch(int arr[],int key) {
    	 int rank=0;
    	 for(int i=0;i<arr.length;i++) {
    		 if(i+1<key) {
    			 rank ++;
    		 }
    	 }return rank;
     }
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter key to find renk-");
		int key=sc.nextInt();
		
		int index=linearSearch(arr,key);
	    System.out.println("Rank of"+" "+key+" "+"is" +" "+index);

	}

}
