public class Home extends House {
	private double yardSize;
	
	public Home(String owner, String roofColor, double yardSize) {
		super(owner, roofColor);
		this.setYardSize(yardSize);
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
	
	public void harvestFromyard() {
		System.out.println("harvestFromField()");
	}
}
