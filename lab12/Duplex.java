public class Duplex extends Home {
	private String coowner;
	
	public Duplex(String owner, String roofColor, double yardSize, String coowner) {
		super(owner, roofColor, yardSize);
		this.setCoOwner(coowner);
	}

	public String getCoOwner() {
		return coowner;
	}

	public void setCoOwner(String coowner) {
		this.coowner = coowner;
	}
}
