public class House {
	private String owner;
	private String roofColor;
	
	public House(String owner, String roofColor) {
		this.owner = owner;
		this.roofColor = roofColor;
	}

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
}
