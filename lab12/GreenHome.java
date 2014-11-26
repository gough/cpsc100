public class GreenHome extends House {
	public GreenHome (String owner, String roofColor) {
		super(owner, "green");
	}
	
	public void setRoofColor(String roofColor) {
		System.out.println("Warning: You can't change the"
				+ " roof color of a green home.");
	}
}
