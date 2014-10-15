public class Array2 {
	public static void main(String args[]) {
		// declare and initialize arrays 1 and 2
		double[] array1 = {1, 2, 3};
		double[] array2 = {1, 2, 3};
		
		// print output of equals() function
		System.out.println(equals(array1, array2));
	}
	
	public static boolean equals(double[] d1, double[] d2) {
		if (d1.length == d2.length) {
			// length of arrays are equal the arrays could
			// be equal
			
			for (int x = 0; x < d1.length; x++) {
				if (d1[x] == d2[x]) {
					// d1[x] is equal to d2[x]
					// keep going...
					continue;
				} else {
					// d1[x] is NOT equal to d2[x]
					// stop loop and return false
					return false;
				}
			}
			
			// since false has not been returned yet (which
			// would stop the for loop), the arrays are equal
			return true;
		} else {
			// length of arrays are different, therefore
			// the arrays are not equal
			return false;
		}
	}
}

/*
 * Output:
 * // d1 = {1, 2, 3};
 * // d2 = {1, 2, 3};
 * true
 * 
 * Output:
 * // d1 = {1, 2, 3};
 * // d2 = {1, 2, 4};
 * false
 * 
 *  * Output:
 * // d1 = {1, 2, 3};
 * // d2 = {1, 2, 3, 4};
 * false
 */
