import java.util.Scanner;

public class MethodCall6 {
	public static void main(String args[]) {
		double age = getAge();
		System.out.printf("you are %.1f years old", age);
	}
	
	public static int getAge() {
		System.out.println("How old are you?");
		
		Scanner myScanner = new Scanner(System.in);
		int i = myScanner.nextInt();
		myScanner.close();
		
		return i;
	}
}