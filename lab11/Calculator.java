import javax.swing.*;
import java.awt.event.*;

public class Calculator {
	JFrame f;
	JTextField num1;
	JTextField num2;
	JTextField output;
	JLabel plus;
	JLabel equals;
	JButton add;
	JPanel p;
	
	final int LENGTH = 350;
	final int WIDTH = 250;
	
	public Calculator() {
		// create frame
		f = new JFrame();
		
		// set frame attributes
		f.setTitle("Calculator");
		f.setSize(LENGTH, WIDTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create panel contents
		num1 = new JTextField(5);
		num2 = new JTextField(5);
		output = new JTextField(5);
		
		plus = new JLabel("+");
		equals = new JLabel("=");
		
		add = new JButton("ADD");
		add.addActionListener(new AddClick());
		
		// add contents to panel
		p = new JPanel();
		p.add(num1);
		p.add(plus);
		p.add(num2);
		p.add(equals);
		p.add(output);
		p.add(add);
		f.add(p);
		
		// show frame
		f.setVisible(true);
	}
	
	private class AddClick implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double d1 = Double.parseDouble(num1.getText());
			double d2 = Double.parseDouble(num2.getText());
			output.setText(Double.toString(d1 + d2));

		}
	}
	
	public static void main(String args[]) {
		Calculator cal = new Calculator();
	}
}
