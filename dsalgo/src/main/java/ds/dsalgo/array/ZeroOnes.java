package ds.dsalgo.array;

public class ZeroOnes {

	public static void main(String[] args) {
		int[] arr= {1,1,1,1,0,0,0};
		
		int start= 0;
		int end = arr.length-1;
		for(int i=0;i<=arr.length-1;i++) {
			if(start>=end)
				break;
			if(arr[i]==0) {
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
