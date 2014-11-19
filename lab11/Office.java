public class Office {
	private String owner;
	private String roofColor;
	private int rentTerm;
	
	public Office() {}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getRoofColor() {
		return roofColor;
	}

	public void setRoofColor(String roofColor) {
		this.roofColor = roofColor;
	}

	public int getRentTerm() {
		return rentTerm;
	}

	private void setRentTerm(int rentTerm) {
		this.rentTerm = rentTerm;
	}
	
	public void extendRentTerm(int month) {
		this.setRentTerm(this.getRentTerm() + month);
	}
}