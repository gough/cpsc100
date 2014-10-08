public class MethodCall8 {
	public static void main(String[] args) {
		System.out.println("I am grandpa, I have an empty plate.");
		
		String plate;
		plate = getDad();
		
		System.out.println("I like " + plate + ".");
	}
	
	public static String getDad() {
		String plate = getSon();
		return plate;
	}
	
	public static String getSon() {
		String plate = getDog();
		return plate;
	}
	
	public static String getDog() {
		String plate = "pasta";
		return plate;
	}
}

/* 
 * Output:
 * I am grandpa, I have an empty plate.
 * I like icecream.
 * 
 * Output:
 * I am grandpa, I have an empty plate.
 * I like cheese.
 * 
 * Output:
 * I am grandpa, I have an empty plate.
 * I like pasta.
 */