package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	JFrame f;
	JPanel p;
	JButton b1;
	JButton b2;
	ArrayList<String> strings = new ArrayList<String>();

	public static void main(String[] args) {
		_02_GuestBook guestbook = new _02_GuestBook();
		guestbook.makeFrame();
	}

	public void makeFrame() {
		f = new JFrame();
		p = new JPanel();
		b1 = new JButton();
		b2 = new JButton();
		f.add(p);
		p.add(b1);
		p.add(b2);
		b1.setText("Add Name");
		b2.setText("View Names");
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);

		f.setVisible(true);
		f.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1) {
			String name = JOptionPane.showInputDialog("Who would you like to add?");
			for (int i = 0; i < 1; i++) {
				strings.add(name);
			}
		} else if (e.getSource() == b2) {
			String thing = new String();
			for (int i = 0; i < strings.size(); i++) {
			thing += "Guest #" + (i+1) + ": " + strings.get(i);
			thing += "\n";
			}
			JOptionPane.showMessageDialog(null, thing);
		}
	}
}
