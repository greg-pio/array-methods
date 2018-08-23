public class Sum_Val {

	public static void main(String[] args) {
		
		// sum values of 1d array
		
		int[] arr1 = {23, 21, 23, 4, 7, 65, 2};
		
		int sum1 = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			sum1 += arr1[i];
		}
		
		System.out.println("Suma w arr1 :" + sum1);
		
		// sum values of 2d array
		
		int[][] arr2 = {
				{1, 5, 21, 12, 34},
				{1, 65, 2, 13, 3},
				{4, 33, 3, 2, 1},
		};
		
		int sum2 = 0;
		
		for (int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				sum2 += arr2[i][j];
			}
		}
		
		System.out.println("Suma w arr2 :" + sum2);

	}

}
