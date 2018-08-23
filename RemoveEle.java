public class RemoveEle {

	public static void main(String[] args) {
		
		int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] tab2 = new int[tab.length-1];
		
		int ele = 7;
		int i = 0;
		
		while (tab[i] != ele) {
			tab2[i]	= tab[i];
			i++;
		}
			
		for(int j = i; j < tab2.length; j++) {
			tab2[j] = tab[j+1];
		}	
		
		for(int g = 0; g < tab2.length; g++) {
			System.out.print(tab2[g] + " ");
		}

	}

}
