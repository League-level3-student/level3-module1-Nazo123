package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javafx.scene.input.KeyCode;

public class TextMachine implements KeyListener {
 JFrame frame = new JFrame();
 JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<String> a = new Stack<String>();
	public void Run() {
	panel.add(label);
	frame.add(panel);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.addKeyListener(this);
	frame.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	
		// TODO Auto-generated method stub
	 if(e.getKeyCode()==KeyEvent.VK_CONTROL&&a.size()>0) {
		 
		 label.setText(label.getText()+a.pop());
		 System.out.println("Undo Sucessful");
		 frame.pack();
	 }
	 else if(e.getKeyCode()!=KeyEvent.VK_BACK_SPACE&&e.getKeyCode()!=KeyEvent.VK_SPACE) {
		label.setText(label.getText()+e.getKeyText(e.getKeyCode()));
		frame.pack();
	}
	else if(e.getKeyCode()!=KeyEvent.VK_SPACE){
	a.push(label.getText().charAt(label.getText().length()-1)+"");
	label.setText(label.getText().substring(0, label.getText().length()-1));
	frame.pack();
	}
	else {
		label.setText(label.getText()+" ");
		frame.pack();
	}
	}
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
	

