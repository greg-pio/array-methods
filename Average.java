public class Average {

	public static void main(String[] args) {
		
		// calculate average value of array elements

		int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double avg = 0;
		int sum = 0;
		int num = tab.length;
		
		for (int i = 0; i < tab.length; i++) {
			sum += tab[i];
		}
		
		avg = sum / num;
		
		System.out.println("Average is: " + avg);
		
	}

}
