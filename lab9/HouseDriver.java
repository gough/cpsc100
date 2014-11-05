public class HouseDriver {
	public static void main(String args[]) {
		House house1 = new House();
		House house2 = new House();
		
		house1.setNumber(22);
		house2.setNumber(44);
		
		house1.setColour("Red");
		house2.setColour("Blue");
		
		System.out.println(house1.getNumber() +
				", " + house1.getColour());
		System.out.println(house2.getNumber() +
				", " + house2.getColour());
				
		house2.setColour("Green");
		
		System.out.println(house1.getNumber() +
				", " + house1.getColour());
		System.out.println(house2.getNumber() +
				", " + house2.getColour());
	}
}

/*
 * Output:
 * 22, Red
 * 44, Blue
 * 22, Red
 * 44, Green
 */