public class NurseryHome extends Home {
	private double rentTerm;

	public double getRentTerm() {
		return rentTerm;
	}

	private void setRentTerm(double d) {
		this.rentTerm = d;
	}
	
	public void extendRentTerm(int month) {
		this.setRentTerm(this.getRentTerm() + month);
	}
}
