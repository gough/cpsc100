import java.util.Scanner;

public class Squared {
	public static void main(String args[]) {
		// construct scanner object
		Scanner myScanner = new Scanner(System.in);
		
		// prompt user for a number to square
		System.out.print("Enter a number to square: ");
		int number = myScanner.nextInt();
		
		// close scanner object
		myScanner.close();
		
		// declare square variable and set to number times itself (squared)
		int square = number * number;
		
		// print square of number
		System.out.printf("The square of %d is %d.", number, square);
	}
}
