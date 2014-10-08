public class MethodCall7 {
	public static void main(String[] args) {
		String name;
		char classLetter;
		
		name = getName();
		classLetter = getClass(name);
		
		System.out.println(name + ", please take your courses in class " + 
			classLetter + ".");
	}
	
	public static String getName() {
		String name = "Adam";
		return name;
	}
	
	public static char getClass(String name) {
		char classLetter = name.charAt(0);
		return classLetter;
	}
}

/* 
 * Output:
 * Adam, please take your courses in class A.
 * 
 * Output:
 * Charlie, please take your courses in class C.
 * 
 * Output:
 * Ralph, please take your courses in class R.
 */