public class Driver {
	public static void main(String args[]) {
		House myHouse = new House("John", "blue");
		System.out.println(myHouse.getOwner());
		myHouse.setOwner("Bob");
		System.out.println(myHouse.getOwner());
		
		Home myHome = new Home("John", "orange", 12.0);
		
		Office myOffice = new Office("John", "orange", 10);
		myOffice.extendRentTerm(200);
		System.out.println(myOffice.getRentTerm()); // 200
		myOffice.extendRentTerm(200.0);
		System.out.println(myOffice.getRentTerm()); // 200 / 50 = 4
		
		GreenHome myGreenHome = new GreenHome("John", "orange");
		System.out.println(myGreenHome.getRoofColor());
		myGreenHome.setRoofColor("purple");
		System.out.println(myGreenHome.getRoofColor());
		
		Duplex myDuplex = new Duplex("John", "orange", 12.0, "Bob");
		NurseryHome myNurseryHome = new NurseryHome(
				"John", "orange", 12.0, 20);
	}
}

/*
 * Output:
 * John
 * Bob
 * 210
 * 214
 * green
 * Warning: You can't change the roof color of a green home.
 * green
 */