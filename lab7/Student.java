public class Student {
	// declare and initialize name variable in Student class
	private static String name = "";

	public static String getName() {
		// getName() returns the student's name
		return Student.name;
	}

	public static void setName(String s) {
		// setName() sets the student's name according to the variable passed
		Student.name = s;
	}
}

/*
 * Output:
 * // Student.setName("Lucy");
 * // Student.getName();
 * Lucy
 */
