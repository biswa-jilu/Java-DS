package ds.dsalgo.array;

public class ContugousSubArr {

	public static void main(String[] args) {
		
		int[] arr = {-1,2,5,-8,-1,2,16,4,9,-5};
		
		int currSUm = 0;
		int startIndex= 0;
		int endIndex= 0;
		int maxSumSoFar = Integer.MIN_VALUE;
		for(int i=0; i<=arr.length-1;i++) {
			currSUm = currSUm+arr[i];
			if(currSUm < 0 ) {
				currSUm=0;
				startIndex=i;
			}if(currSUm > maxSumSoFar) {
				maxSumSoFar= currSUm;
				endIndex= i;
			}
			
		}
		

		System.out.println(maxSumSoFar);
		System.out.println(startIndex);
		System.out.println(endIndex);
	}

}
