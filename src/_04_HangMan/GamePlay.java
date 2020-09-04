package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GamePlay implements KeyListener {
	String word;
	boolean gamePlay = false;
	Utilities u = new Utilities();
	Stack<String> words = new Stack<String>();
	String d = "dictionary.txt";
	JFrame wordDisplay = new JFrame();
	JPanel panel = new JPanel();
	JLabel letters = new JLabel();
	JLabel liveNum = new JLabel();
	int lives = 5;
	int a;
	int wins;
	public void start() {
		panel.add(letters);
		panel.add(liveNum);
	wordDisplay.addKeyListener(this);
	wordDisplay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	wordDisplay.add(panel);
	wordDisplay.setVisible(true);
	
	int maxWords = u.getTotalWordsInFile(d);
	 a = Integer.parseInt(JOptionPane.showInputDialog(null,"Please pick a number between 1 and "+maxWords+". This is the amount of words that will be in your game"));	
	if(a>maxWords) {
	System.out.println("Too big of an input");
	System.exit(1);
	}
	for(int i = 0;i<a;i++) {
	words.push(u.readRandomLineFromFile(d));
	}
	System.out.println(words);
play();
		
	
	
	}
	
	
	public void play() {
		if(words.size()>0) {
		wordDisplay.setSize(200, 100);
		letters.setText("");
	gamePlay = true;
	lives = 5;
	liveNum.setText("You have "+lives+" lives remaining.");
	
	JOptionPane.showMessageDialog(null, "You have 5 lives. Any key you press will count as a guess. \n The panel shows you how many letters there are and what have been found already.");
	 word = words.pop();
	for(int i = 0; i < word.length(); i++) {
		letters.setText(letters.getText()+"|"+"");
		
	}
	System.out.println(word);


	
		}
		else {
			JOptionPane.showMessageDialog(null, "You have run out of words to play. You got "+wins+" out of "+a+" tries! \n Try your luck again. Restart the program and play again!");
		}
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

char l;
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		l = e.getKeyChar();
		if(gamePlay) {
			if(word.contains(l+"")) {
				for(int i = 0; i<word.length();i++) {
				if((l+"").equals(word.charAt(i)+"")) {
				String holder = letters.getText();
				char[] a = holder.toCharArray();
				holder = "";
				a[i] = l;
				for(int g = 0; g<a.length;g++) {
					holder = holder+a[g];
				}
				letters.setText(holder);
				
				}
				
				}
			}
			else {
				lives--;
				liveNum.setText("\n You have "+lives+" lives remaining.");
				
				
			}
			
		}
		if(!(letters.getText().contains("|"))){
			JOptionPane.showMessageDialog(null, "You won keep playing to get a better score!");
			wordDisplay = new JFrame();
			wins++;
			play();
		}
		else if(lives == 0) {
			JOptionPane.showMessageDialog(null, "You ran out of lives, try the next word!");
			wordDisplay = new JFrame();
			play();
			
		}
		
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
