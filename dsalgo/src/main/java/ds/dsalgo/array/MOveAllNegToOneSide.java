package ds.dsalgo.array;

public class MOveAllNegToOneSide {

	public static void main(String[] args) {
		int[] arr = {-1,2,5,-8,-1,2,16,4,9,-5};
		
		
		int start=0;
		for(int i=0; i<=arr.length-1;i++) {
			
			if(arr[i]<0) {
				int temp = arr[i];
				arr[i] = arr[start];
				arr[start] = temp;
				start++;
				
			}
			
		}
for(int i=0;i<=arr.length-1;i++) {
			
			System.out.println(arr[i]);
		}

	}

}
