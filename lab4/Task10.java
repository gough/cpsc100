public class Task10 {
	public static void main(String[] args) {
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				for (int z = 0; z < 4; z++) {
					System.out.print("● ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

/* 
 * Output:
 * ● ● ● ● 
 * ● ● ● ● 
 * ● ● ● ● 
 * 
 * ● ● ● ● 
 * ● ● ● ● 
 * ● ● ● ● 
 * 
 * ● ● ● ● 
 * ● ● ● ● 
 * ● ● ● ● 
 */