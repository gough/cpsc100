import javax.swing.JOptionPane;

public class AgeNextYear {
	public static void main(String args[]) {
		// prompts user for for their name
		String name = JOptionPane.showInputDialog("What is your name?");
		
		// prompts user for for their age
		String ageString = JOptionPane.showInputDialog("How old are you this year?");
		
		// covert string to double using parseDouble
		double ageDouble = Double.parseDouble(ageString);
		
		// shows a message dialog on the screen with their age next year
		JOptionPane.showMessageDialog(null, name + ", you will be " + (ageDouble + 1) + " years old next year.");
	}
}
