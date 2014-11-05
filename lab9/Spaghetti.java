public class Spaghetti {
	public static void printSpaghetti(int packages, String brand) {
		System.out.printf("I have %d packages of %s brand spaghetti.\n", packages, brand);
	}
	
	public static void main(String args[]) {
		String brand1 = "Craft";
		int package1 = 5;
		printSpaghetti(package1, brand1);
		
		String brand2 = "Barilla";
		int package2 = 2;
		printSpaghetti(package2, brand2);
		
		String brand = "Pacific";
		int box = 5;
		printSpaghetti(box, brand);
		
		package2--;
		printSpaghetti(package2, brand2);
		
		package2--;
		printSpaghetti(package2, brand2);
		
		package2--;
		printSpaghetti(package2, brand2);
	}
}

/*
 * Output
 * I have 5 packages of Craft brand spaghetti.
 * I have 2 packages of Barilla brand spaghetti.
 * I have 5 packages of Pacific brand spaghetti.
 * I have 1 packages of Barilla brand spaghetti.
 * I have 0 packages of Barilla brand spaghetti.
 * I have -1 packages of Barilla brand spaghetti.
 */
