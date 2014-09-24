import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {
		// construct scanner object
		Scanner myScanner = new Scanner(System.in);
		
		// prompt user for first number
		System.out.print("Enter first number: ");
		float first = myScanner.nextFloat();
		
		// prompt user for second number
		System.out.print("Enter second number: ");
		float second = myScanner.nextFloat();
		
		// close scanner object
		myScanner.close();
		
		if (first > second) {
			// if first number is greater than second
			System.out.printf("%f > %f", first, second);
		} else if (first < second) {
			// if first number is less than second
			System.out.printf("%f < %f", first, second);
		} else {
			// first number must then be equal to second
			System.out.printf("%f = %f", first, second);
		}
	}
}

/* 
 * Output:
 * Enter first number: 5
 * Enter second number: 10
 * 5.000000 < 10.000000
 * 
 * Output:
 * Enter first number: 10
 * Enter second number: 5
 * 10.000000 > 5.000000
 * 
 * Output: 
 * Enter first number: 5
 * Enter second number: 5
 * 5.000000 = 5.000000
 */
