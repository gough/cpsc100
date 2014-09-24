import java.util.Scanner;

public class LetterGrade {
	public static void main(String args[]) {
		// construct scanner object
		Scanner myScanner = new Scanner(System.in);
		
		// prompt user for numeric grade
		System.out.print("Enter a numeric grade: ");
		int grade = myScanner.nextInt();
		
		// close scanner object
		myScanner.close();
		
		if (grade >= 0 && grade <= 100) {
			// input grade is valid therefore grade according to scale
			if (grade >= 90) {
				System.out.println("A+");
			} else if (grade >= 85) {
				System.out.println("A");
			} else if (grade >= 80) {
				System.out.println("A-");
			} else if (grade >= 77) {
				System.out.println("B+");
			} else if (grade >= 73) {
				System.out.println("B");
			} else if (grade >= 70) {
				System.out.println("B-");
			} else if (grade >= 67) {
				System.out.println("C+");
			} else if (grade >= 63) {
				System.out.println("C");
			} else if (grade >= 60) {
				System.out.println("C-");
			} else if (grade >= 57) {
				System.out.println("D+");
			} else if (grade >= 53) {
				System.out.println("D");
			} else if (grade >= 50) {
				System.out.println("D-");
			} else {
				System.out.println("F");
			}
		} else {
			// input grade is invalid
			System.out.println("User input must be between 0 and 100. Bye bye!");
		}
	}
}

/* 
 * Output:
 * Enter a numeric grade: 100
 * A+
 * 
 * Output:
 * Enter a numeric grade: -1
 * User input must be between 0 and 100. Bye bye!
 */
