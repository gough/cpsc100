public class Home {
	private String owner;
	private String roofColor;
	private double yardSize;
	
	public Home() {}

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

	public double getYardSize() {
		return yardSize;
	}

	public void setYardSize(double yardSize) {
		this.yardSize = yardSize;
	}
	
	public void plantInYard() {
		System.out.println("plantInYard()");
	}
	
	public void harvestFromYard() {
		System.out.println("harvestFromYard()");
	}
}