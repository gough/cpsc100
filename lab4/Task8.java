public class Task8 {
	public static void main(String[] args) {
		// initialize line length variable
		int c = 1;
		
		for (int x = 0; x < 5; x ++ ) {		
			for (int y = 0; y < c; y++) {
				// print symbol
				System.out.print("● ");
			}
			
			// print newline
			System.out.println();
			
			// increment c by 2 to increase line length
			c += 2;
		}
	}
}

/* 
 * Output:
 * ● 
 * ● ● ● 
 * ● ● ● ● ●
 * ● ● ● ● ● ● ● 
 * ● ● ● ● ● ● ● ● ● 
 */