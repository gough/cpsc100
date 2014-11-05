public class MyClass {
	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		
		stu1.setName("Will");
		stu1.setScore(60);
		
		stu2.setName("Ethan");
		stu2.setScore(60);
		
		stu3.setName("Kevin");
		stu3.setScore(60);
		
		System.out.println(stu1.getName() + 
				", " + stu1.getScore());
		
		System.out.println(stu2.getName() + 
				", " + stu2.getScore());
		
		System.out.println(stu3.getName() + 
				", " + stu3.getScore());
		
		stu1.setScore(stu1.getScore() + 10);
		stu2.setScore(stu2.getScore() + 10);
		stu3.setScore(stu3.getScore() + 10);
		
		System.out.println(stu1.getName() + 
				", " + stu1.getScore());
		
		System.out.println(stu2.getName() + 
				", " + stu2.getScore());
		
		System.out.println(stu3.getName() + 
				", " + stu3.getScore());
	}
}

/*
 * Output:
 * Will, 60
 * Ethan, 60
 * Kevin, 60
 * Will, 70
 * Ethan, 70
 * Kevin, 70
 */
