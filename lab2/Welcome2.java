import javax.swing.JOptionPane;

public class Welcome2 {
	public static void main(String args[]) {
		// prompts user for for their name
		String name = JOptionPane.showInputDialog("What's your name?");
		
		// shows a message dialog on the screen with their name
		JOptionPane.showMessageDialog(null, "Welcome, " + name + "!");
	}
}
