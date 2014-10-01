import java.util.Scanner;

public class MyFor3 {
	public static void main(String[] args) {
		// prompt user for integer
		System.out.print("Enter a positive integer: ");
		
		// construct Scanner object and get integer
		Scanner myScanner = new Scanner(System.in);
		int n = myScanner.nextInt();
		myScanner.close();
		
		// set n integer to sum
		int sum = n;
		
		if (n > 0) {
			// recurse over n until x is less than n
			for (int x = 1; x < n; x++) {
				sum *= (n-x);
			}
		} else if (n == 0) {
			sum = 1;
		} else {
			// everything else doesn't exist
			sum = 0;
		}
		
		// print sum
		System.out.println(n + "! = " + sum);
	}
}

/* 
 * Output:
 * Enter a positive integer: -1
 * -1! = 0
 * 
 * Output:
 * Enter a positive integer: 10
 * 10! = 3628800
 * 
 * Output: 
 * Enter a positive integer: 0
 * 0! = 1
 */