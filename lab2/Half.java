import java.util.Scanner;

public class Half {
	public static void main(String args[]) {
		// construct scanner object
		Scanner myScanner = new Scanner(System.in);
		
		// prompt user for a integer to half (divide by 2)
		System.out.print("Enter a number to half: ");
		int number = myScanner.nextInt();
		
		// close scanner object
		myScanner.close();
		
		// declare half variable and set to number divided by 2 (halfed)
		int half = number / 2;
		
		// print half of number
		System.out.printf("The half of %d is %d.", number, half);
	}
}
