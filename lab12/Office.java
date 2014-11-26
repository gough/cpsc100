public class Office extends House {
	private int rentTerm;
	
	public Office(String owner, String roofColor, int rentTerm) {
		super(owner, roofColor);
		this.rentTerm = rentTerm;
	}

	public void extendRentTerm(int month) {
		this.rentTerm = this.getRentTerm() + month;
	}
	
	public void extendRentTerm(double amountPaid) {
		int month = (int) amountPaid / 50;
		this.rentTerm = this.getRentTerm() + month;
	}

	public int getRentTerm() {
		return this.rentTerm;
	}
}
