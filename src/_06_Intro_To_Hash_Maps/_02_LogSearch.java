package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	HashMap<Integer, String> a = new HashMap<Integer,String>();
	ArrayList<Integer> ids = new ArrayList<Integer>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	public void run() {
		b1.addActionListener(this);
		b1.setText("Add Entry");
		panel.add(b1);
		b2.addActionListener(this);
		b2.setText("Search by ID");
		panel.add(b2);
		b3.addActionListener(this);
		b3.setText("View List");
		panel.add(b3);
		b4.addActionListener(this);
		b4.setText("Remove Entry");
		panel.add(b4);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	
	}
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.y
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(b1)) {
			int id = Integer.parseInt(JOptionPane.showInputDialog("Input the ID of this entry"));
			String name = JOptionPane.showInputDialog("Input the name of this entry");
			a.put(id,name);
			ids.add(id);
			}
		else if(e.getSource().equals(b2)) {
			boolean b = true;
			int id = Integer.parseInt(JOptionPane.showInputDialog("What is the ID of the entry you want?"));
		
				if(a.containsKey(id)) {
					JOptionPane.showMessageDialog(null, ""+a.get(id));
					b = false;
				}
			
			if(b) {
			JOptionPane.showMessageDialog(null, "This ID is not in this list");
			}
		}
		else if(e.getSource().equals(b3)) {
			String aString = "";
		for(int i = 0; i < a.size(); i++) {
			 aString = aString+"ID: "+ ids.get(i)+"  Name: "+a.get(ids.get(i))+"\n";
			
		}
		JOptionPane.showMessageDialog(null, aString);
		
		}
		else if(e.getSource().equals(b4)) {
			boolean b = true;
			int id = Integer.parseInt(JOptionPane.showInputDialog("What is the ID of the entry you want to remove?"));
				if(a.containsKey(id)) {
				a.remove(id);
				ids.remove(new Integer(id));
				
					b = false;
				}
				if(b) {
					JOptionPane.showMessageDialog(null, "This ID is not in this list");
					}
			}
			
		}
	}
	

