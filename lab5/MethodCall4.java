public class MethodCall4 {
	public static void main(String[] args) {
		String name = "Adam";
		double height = 150.5;
		
		welcome(name, height);
		
		System.out.println("Thank you for joining us!");
	}
	
	public static void welcome(String s, double d) {
		System.out.println(s + ", you are " + d + " cm/feet tall!");
		System.out.println("Welcome to join us!");
	}
}

/* 
 * Output:
 * Adam, you are 150.5 cm/feet tall!
 * Welcome to join us!
 * Thank you for joining us!
 */