public class Student {
	
	/*
	 * Variables
	 */
	
	private String name = "";
	private double score = 0;

	/*
	 * Constructors
	 */
	
	public Student(String name, double score) {
		this.name = name;
		this.score = score;
	}
	
	public Student(String name) {
		this.name = name;
		this.score = 0;
	}
	
	public Student(double score) {
		this.name = "n/a";
		this.score = score;
	}
	
	public Student() {
		this.name = "n/a";
		this.score = 0;
	}
	
	/*
	 * Methods
	 */
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return this.score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	public boolean equals(Student s2) {
		if (
			this.getName() == s2.getName() &&
			this.getScore() == s2.getScore())
		{
			return true;
		} else {
			return false;
		}
	}
}