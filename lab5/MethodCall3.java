public class MethodCall3 {
	public static void main(String[] args) {
		String name = "Adam";
		
		welcome(name);
		
		System.out.println("Thank you for joining us!");
	}
	
	public static void welcome(String s) {
		System.out.println(s + ", you are welcome to join us!");
	}
}