package _04_HangMan;

import java.util.Stack;

import javax.swing.JOptionPane;

public class GamePlay {
	Utilities u = new Utilities();
	Stack<String> words = new Stack<String>();
	String d = "dictionary.txt";
	public void start() {
	
	int maxWords = u.getTotalWordsInFile(d);
	int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Please pick a number between 1 and "+maxWords+". This is the amount of words that will be in your game"));	
	if(a>maxWords) {
	System.out.println("Too big of an input");
	System.exit(1);
	}
	for(int i = 0;i<a;i++) {
	words.push(u.readRandomLineFromFile(d));
	}

		
	
	
	}
}
