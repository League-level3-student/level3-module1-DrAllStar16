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
	int number = new Integer(0);
	Stack<String> words = new Stack<String>();
	String currentWord = new String();
	int wordSize = new Integer(0);

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
		f.add(p);
		p.add(l);
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
		String blank = " ";
		for (int i = 0; i < wordSize; i++) {
			blank += "_ ";
		}
		l.setText(blank);
		f.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		for (int i = 0; i < currentWord.length(); i++) {
			if (e.getKeyChar()== currentWord.charAt(i)) {
				String labeltext = l.getText();
				String replaced = labeltext.substring(0,(i*2))+currentWord.charAt(i)+labeltext.subSequence((i*2)+2, labeltext.length());
				l.setText(replaced);
		}
}	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
