public class Tablice {

	public static void main(String[] args) {
		
		// min-max value
		
		int tab[] = new int[10];
		
		for (int i = 0; i < 10; i++) 
			tab[i] = (int) (Math.random() * 100);
		
		System.out.print("tab:");
		for (int i = 0; i < 10; i++)
			System.out.print(tab[i] + " ");
		
		System.out.println();
		
		int min, max;
		min = max = tab[0];
		
		for (int i = 0; i < 10; i++) {
			if (tab[i] < min) min = tab[i];
			if (tab[i] > max) max = tab[i];
		}
		
		System.out.println("Min and max:" + min + " " + max);
		
		// bubble sort
		
		System.out.println();
		
		int tab2[] = new int[10];
		int a, b, t;
		
		for (int i = 0; i < 10; i++) 
			tab2[i] = (int) (Math.random() * 100);
		
		System.out.print("Unsorted tab:"); 
		for (int i = 0; i < 10; i++)
			System.out.print(" " + tab2[i]);
		
		for (a = 1; a < 10; a++)
			for (b = 10 - 1; b >= a; b--) {
				if (tab2[b-1] > tab2[b]) {
					t = tab2[b-1];
					tab2[b-1] = tab2[b];
					tab2[b] = t;
			}
		}
	
		System.out.println();
		
		System.out.print("Sorted tab:"); 
		for (int i = 0; i < 10; i++)
			System.out.print(" " + tab2[i]);
		
		// sum
		
		System.out.println();
		System.out.println();
		
		int tab3[] = new int[10];
		int suma = 0; 
		
		for (int i = 0; i < 10; i++) 
			tab3[i] = (int) (Math.random() * 100);
		
		System.out.print("Tab3:"); 
		for (int i = 0; i < 10; i++)
			System.out.print(" " + tab3[i]);
		
		for (int i = 0; i < tab3.length; i++)
			suma += tab3[i];
		
		System.out.println();
		System.out.print("Suma: " + suma);
		
		// look for value
		
		System.out.println();
		System.out.println();
		
		int tab4[] = {5, 7, 4, 3, -4, 6, 0, 22};
		int val = 5;
		boolean found = false;
		
		for (int i = 0; i < tab4.length; i++) {
			if (tab4[i] == val)
				found = true;
		}
		
		if (found)
			System.out.println("Value found!");
		else
			System.out.println("Value not found!");
		
		// average value
		
		System.out.println();
		
		int tab5[] = new int[10];
		int sum = 0;
		double average;
		
		for (int i = 0; i < 10; i++) 
			tab5[i] = (int) (Math.random() * 10);
		
		System.out.print("tab5: ");
		for (int i = 0; i < 10; i++)
			System.out.print(tab5[i] + " ");
		
		System.out.println();
		
		for (int i = 0; i < tab5.length; i++)
			sum += tab5[i];
		
		average = sum / tab5.length;
		
		System.out.print("Average of values in tab: " + average);
		
		// reverse array 
		
		System.out.println();
		System.out.println();
		
		int tab6[] = {5, 7, 4, 3, -4, 6, 0, 22, 66};
		int temp;
		
		System.out.print("Normal: ");
		for (int i = 0; i < tab6.length; i++)
			System.out.print(tab6[i] + " ");
	
		for (int i = 0; i < tab6.length / 2; i++) {
				temp = tab6[i];
				tab6[i] = tab6[tab6.length - i - 1];
				tab6[tab6.length - i - 1] = temp;				
			}
		
		System.out.println();
		System.out.print("Reversed: ");
		for (int i = 0; i < tab6.length; i++)
			System.out.print(tab6[i] + " ");
				
		
	
		
	}
}
