package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Shuffler implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	Song[] songs = new Song[3];
	Random r = new Random();

	public void start() {

		f.add(p);
		p.add(b);
		b.setText("Surprise Me!");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
		b.addActionListener(this);
	}

	public Shuffler() {
		songs[0] = new Song("old-fashioned-school-bell-daniel_simon.mp3");
		songs[1] = new Song("llama.wav");
		songs[2] = new Song("scream.wav");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == b) {
			songs[r.nextInt(3)].play();
		}

	}
}
