public class ContainsVal {

	public static void main(String[] args) {
		
		char[] tab = {'a', 'b', 'd', 'n', 'a', 'c'};
		char val = 'a';
		boolean stop = true;
		
		while (stop) {
			for(int i = 0; i < tab.length; i++) {
				if(val == tab[i]) {
					System.out.println("Value found: " + val);
					stop = false;
					break;
				}
			}	
		}
	}
}
