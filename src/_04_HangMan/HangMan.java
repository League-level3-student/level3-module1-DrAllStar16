package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	JFrame f;
	JPanel p;
	JLabel l;
	JLabel l2;
	int number = new Integer(0);
	Stack<String> words = new Stack<String>();
	String currentWord = new String();
	int wordSize = new Integer(0);
	Boolean won = false;
	Boolean replacedThing = false;
	int lives=new Integer(10);

	public static void main(String[] args) {
		HangMan hangman = new HangMan();
		hangman.makeFrame();
		hangman.getWords();
		hangman.makeLabel();

	}

	public void makeFrame() {
		f = new JFrame();
		p = new JPanel();
		l = new JLabel();
		l2 = new JLabel();
		f.add(p);
		p.add(l);
		p.add(l2);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.addKeyListener(this);
		f.pack();
	}

	public void getWords() {
		String n = JOptionPane.showInputDialog("Pick a number up to 250");
		number = Integer.parseInt(n);
		for (int i = 0; i < number; i++) {
			words.add(Utilities.readRandomLineFromFile("dictionary.txt"));
		}
		currentWord = words.pop();
		wordSize = currentWord.length();
		System.out.println(currentWord);
	}

	public void makeLabel() {
		String blank = "";
		for (int i = 0; i < wordSize; i++) {
			blank += "_ ";
		}
		l.setText(blank);
		l2.setText("You have " + lives + " lives");
		f.pack();
	}

	public void checkIfWon() {
		if (!l.getText().contains("_")) {
			won = true;
			words.pop();
			startCode();
		}
	}
	
	public void startCode() {
		lives =10;
		l.setText(" ");
		f.pack();
		makeFrame();
		getWords();
		makeLabel();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		replacedThing = false;
		for (int i = 0; i < currentWord.length(); i++) {
			if (e.getKeyChar() == currentWord.charAt(i)) {
				String labeltext = l.getText();
				String replaced = labeltext.substring(0, (i * 2)) + currentWord.charAt(i)
						+ labeltext.substring((i * 2) + 1, labeltext.length());
				l.setText(replaced);
				replacedThing = true;
				f.pack();
				checkIfWon();
			}
		}
		if (replacedThing == false) {
			String yesorno = new String();
			lives = lives - 1;
			l2.setText("You have " + lives + " lives");
			if (lives == 0) {
				yesorno = JOptionPane.showInputDialog("You failed, Do you want to play again?");
				if (yesorno.equalsIgnoreCase("yes")) {
					startCode();
				}
				else {
					System.exit(0);
				}
			}

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
