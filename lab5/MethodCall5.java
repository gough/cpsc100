public class MethodCall5 {
	public static void main(String[] args) {
		String name;
		
		name = getName();
		
		System.out.println("Nice to meet you, " + name + ".");
	}
	
	public static String getName() {
		String s = "Adam";
		return s;
	}
}
