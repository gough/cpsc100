import java.util.Scanner;

public class GetAddr {
	public static void main(String args[]) {		
		// construct Scanner object
		Scanner myScanner = new Scanner(System.in);
		
		// prompt user for street name
		System.out.print("Street Name: ");
		String streetName = myScanner.nextLine();
		
		// prompt user for house number
		System.out.print("House Number: ");
		int houseNumber = myScanner.nextInt();
		
		// close scanner object
		myScanner.close();
		
		// print street name and house number from input received
		System.out.printf("Your address is %d %s", houseNumber, streetName);
	}
}
