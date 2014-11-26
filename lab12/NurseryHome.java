public class NurseryHome extends Home {
	private int rentTerm;
	
	public NurseryHome(String owner, String roofColor, double yardSize, int rentTerm) {
		super(owner, "red", yardSize);
		this.rentTerm = rentTerm;
	}
	
	public void extendRentTerm(int month) {
		this.rentTerm = this.rentTerm + month;
	}
}
