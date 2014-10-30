public class StudentTest5 {
	public static void main(String[] args) {
		// declare and initialize two students with
		// no variables passed
		Student stu1 = new Student();
		Student stu2 = new Student();
		
		System.out.println(stu1.getName());
		System.out.println(stu2.getName());
		
		// set the two students' names
		stu1.setName("Tom");
		stu2.setName("Jerry");
		
		// ...and scores
		stu1.setScore(80);
		stu2.setScore(90);
		
		System.out.println(
			stu1.getName() + " " + stu1.getScore()
		);
		System.out.println(
			stu2.getName() + " " + stu2.getScore()
			);
	}
}

/*
 * Output:
 * n/a
 * n/a
 * Tom 80.0
 * Jerry 90.0
 */