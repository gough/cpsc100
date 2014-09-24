import java.util.Scanner;

public class HiScore {
	public static void main(String[] args) {
		// construct scanner object
		Scanner myScanner = new Scanner(System.in);
		
		// prompt user for score
		System.out.print("Enter your score: ");
		int score = myScanner.nextInt();
		
		// close scanner object
		myScanner.close();
		
		if (score >= 90) {
			// if score >= 90, congratulate user
			System.out.println("Great job!");
		}
		
		// thank user for using application
		System.out.println("Thanks for playing!");
	}
}

/* 
 * Output:
 * Enter your score: 99
 * Great job!
 * Thanks for playing!
 * 
 * Output:
 * Enter your score: 20
 * Thanks for playing!
 */