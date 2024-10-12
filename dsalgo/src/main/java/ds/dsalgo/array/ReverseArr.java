package ds.dsalgo.array;

public class ReverseArr {

	public static void main(String[] args) {
		int[] arr= {5,6,7,2,3,4,10};
		
		int end = arr.length-1;
		for(int i =0; i<=arr.length-1;i++) {
			
			if(i >= end) {
				break;
			}
			int temp = arr[i] ;
			arr[i]= arr[end];
			arr[end]= temp;
			end--;
		}
		
		for(int i =0; i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
