public class StudentTest6 {
	public static void main(String args[]) {
		// declare and initialize two Studenr variables
		Student stu1 = new Student("Tom", 99);
		Student stu2 = new Student("Tom", 99);
		
		// compare values using equals method
		if (equals(stu1, stu2)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}
	
	public static boolean equals(Student s1, Student s2) {
		// if s1 name == s2 name and s1 score == s2 score
		if (
			s1.getName() == s2.getName() &&
			s1.getScore() == s2.getScore()
		) {
			// student's are equal
			return true;
		} else {
			// student's are not equal
			return false;
		}
	}
}

/*
 * Output:
 * equal
 */