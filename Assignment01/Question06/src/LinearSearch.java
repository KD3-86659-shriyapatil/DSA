
public class LinearSearch {
	public static int linearSearch(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
//			count++;
			int j;
			for( j=i+1;j<arr.length;j++) {
				if( i != j && arr[i] == arr[j]) {
					break;
				}
			}if( j == arr.length){
				return arr[i];
			}
		}return -1;
	}
	public static void main(String[] args) {
		int arr [] = {1,2,3,-1,2,1,0,4,-1,7,8};
		
		int index = linearSearch(arr);
		System.out.println("first non repearing elements="+index);
		}

	}


