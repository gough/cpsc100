import java.util.Scanner;

public class ValidInput {
	public static void main(String[] args) {
		// construct scanner object
		Scanner myScanner = new Scanner(System.in);
		
		// prompt user for integer input
		System.out.print("Enter integer between 0 and 100: ");
		int input = myScanner.nextInt();
		
		// close scanner object
		myScanner.close();
		
		if (input < 0) {
			// input is < 0
			System.out.println("User input must be between 0 and 100. Bye bye!");
		} else if (input > 100) {
			// input is > 100
			System.out.println("User input must be between 0 and 100. Bye bye!");
		} else {
			// input is between 0 and 100
			System.out.println("Now you can execute Pass.java to check your score. Good luck!");
		}
	}
}

/* 
 * Output:
 * Enter integer between 0 and 100: -1
 * User input must be between 0 and 100. Bye bye!
 * 
 * Output:
 * Enter integer between 0 and 100: 101
 * User input must be between 0 and 100. Bye bye!
 * 
 * Output:
 * Enter integer between 0 and 100: 42
 * Now you can execute Pass.java to check your score. Good luck!
 */