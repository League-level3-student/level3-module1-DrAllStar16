package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame f;
	JPanel p;
	JButton b1;
	JButton b2;
	public static void main(String[] args) {
	makeFrame();
	}
	
	public void makeFrame() {
		 f = new JFrame();
		 p = new JPanel();
		 b1 = new JButton();
		 b2 = new JButton();
		f.add(p);
		p.add(b1);
		p.add(b2);
		f.setVisible(true);
		f.pack();
		
		b1.setText("Add Name");
		b2.setText("View Names");
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==b1) {
			JOptionPane.showInputDialog("Who would you like to add?");
		}
	}
}
