public class Find_index {

	public static void main(String[] args) {
		
		int[] tab = {32, 21, 1, 43, 65, 3, 4, 4, 7, 8, 10};
		int ele = 3;
		
		int i;
		for(i = 0; i < tab.length; i++) {
			if (ele == tab[i])
				System.out.println("Indeks elementu: " + i);
		}

	}

}
