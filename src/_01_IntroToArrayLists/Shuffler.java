package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Shuffler implements ActionListener {

	public void start() {
	
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	f.add(p);
	p.add(b);
	b.setText("Surprise Me!");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.pack();
	f.setVisible(true);
	b.addActionListener(this);
}
	public Shuffler() {
		new Song("moo.wav");
		new Song("llama.wav");
		new Song("scream.wav");
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
