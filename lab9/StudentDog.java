public class StudentDog {
	public static void main(String[] args) {
		Student student1 = new Student();
		Dog dog1 = new Dog();
		Student student2 = new Student();
		Dog dog2 = new Dog();
		
		student1.setName("Terry");
		
		System.out.println(student1.getName());
		
		dog1.setName("Herby");
		dog1.setAge(4);
		dog1.setOwner(student1.getName());
		
		System.out.println(dog1.getName() + ", " +
				dog1.getAge() + ", " + dog1.getOwner());
		
		student2.setName("Ralph");
		dog2.setName("Olly");
		dog2.setOwner(student2.getName());
		
		System.out.println(dog2.getName() + ", " + dog2.getOwner());
		
		dog2.setOwner(student1.getName());
		
		System.out.println(dog2.getName() + ", " + dog2.getOwner());
	}
}

/*
 * Output:
 * Terry
 * Herby, 4, Terry
 * Olly, Ralph
 * Olly, Terry
 */
