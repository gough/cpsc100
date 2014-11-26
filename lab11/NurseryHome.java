public class NurseryHome extends Home {
	private double rentTerm;

	public double getRentTerm() {
		return rentTerm;
	}

	private void setRentTerm(double d) {
		this.rentTerm = d;
	}
	
	public void extendRentTerm(int month) {
		// adds the supplied months to the rent term
		this.setRentTerm(this.getRentTerm() + month);
	}
}
