import java.util.Scanner;

public class Pass {
	public static void main(String[] args) {
		// construct scanner object
		Scanner myScanner = new Scanner(System.in);
		
		// prompt user for score
		System.out.print("Enter your score: ");
		int score = myScanner.nextInt();
		
		// close scanner object
		myScanner.close();
		
		if (score >= 60) {
			// if score >= 60, user passes
			System.out.println("Pass!");
		} else {
			// otherwise, user fails
			System.out.println("Fail!");
		}
		
		System.out.println("Thanks for playing!");
	}
}

/* 
 * Output:
 * Enter your score: 70
 * Pass!
 * Thanks for playing!
 * 
 * Output:
 * Enter your score: 55
 * Fail!
 * Thanks for playing!
 */