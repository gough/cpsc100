import java.util.Scanner;

public class Array3 { 	
	public static void main(String[] args) {
		// declare and initialize integer array
		int[] array1 = new int[6];
		
		Scanner myScanner = new Scanner(System.in);
		
		// prompt user for 6 integers
		for (int x = 0; x < 6; x++) {
			System.out.print("array[" + x + "]: ");
			array1[x] = myScanner.nextInt();
		}
	
		myScanner.close();
		
		// print array before change() function
		System.out.print("Before change(): ");
		printArray(array1);
		
		// set array1 to output of change() function
		array1 = change(array1);
		
		// print array after function
		System.out.print("After change(): ");
		printArray(array1);
	}
	
	public static int[] change(int[] array1) {
		// change first value of array1 to 0
		array1[0] = 0;
		
		return array1;
	}
	
	public static void printArray(int[] array1) {
		// function to print array onto screen
		System.out.print("{");
		for (int x = 0; x < array1.length; x++) {
			if (x == (array1.length - 1)) {
				System.out.print(array1[x]);
			} else {
				System.out.print(array1[x] + ", ");
			}
		}
		System.out.println("}");
	}
}

/*
 * Output:
 * array[0]: 1
 * array[1]: 2
 * array[2]: 3
 * array[3]: 4
 * array[4]: 5
 * array[5]: 6
 * Before change(): {1, 2, 3, 4, 5, 6}
 * After change(): {0, 2, 3, 4, 5, 6}
 */