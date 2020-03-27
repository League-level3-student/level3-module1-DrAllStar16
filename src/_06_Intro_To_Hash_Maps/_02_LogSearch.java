package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */
	JFrame f;
	JPanel p;
	JButton b;
	JButton b2;
	JButton b3;
	HashMap<Integer, String> users = new HashMap<Integer, String>();

	public static void main(String[] args) {
		_02_LogSearch logSearch = new _02_LogSearch();
		logSearch.makingFrame();
	}

	public void makingFrame() {
		f = new JFrame();
		p = new JPanel();
		b = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		f.add(p);
		p.add(b);
		p.add(b2);
		p.add(b3);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b.setText("Add User");
		b2.setText("Search User ID Number");
		b3.setText("View All Users");
		f.pack();
	}

	public void buttonOne() {
		int iid = 0;
		String id = new String();
		String name = new String();
		id = JOptionPane.showInputDialog("Please Type User ID Number");
		name = JOptionPane.showInputDialog("Please Type User Name");
		iid = Integer.parseInt(id);
		users.put(iid, name);
	}

	public void buttonTwo() {
		String enteredId = new String();
		int newId = 0;
		enteredId = JOptionPane.showInputDialog("Please Type A User ID Number");
		newId = Integer.parseInt(enteredId);
		if (users.get(newId) == null) {
			JOptionPane.showMessageDialog(null, "There Is No User Under ID "+newId);
		}
		else {
			JOptionPane.showMessageDialog(null, "Name At ID Number "+newId+ " Is "+users.get(newId));
		}
		
	}
	public void buttonThree() {
		for (int i = 1; i < users.size()+1; i++) {
			JOptionPane.showMessageDialog(null, "NAME: "+ users.get(i)+ " ID: ");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b) {
			buttonOne();
		}
		if (e.getSource() == b2) {
			buttonTwo();
		}
		if (e.getSource() == b3) {
			buttonThree();
		}

	}

}
