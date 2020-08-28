package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> test = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		Random r = new Random();

		for (int i = 0; i<100;i++) {
			test.push(r.nextDouble()*100);
		}
		String a = JOptionPane.showInputDialog(null,"Input a number 0 - 100");

		
	 double inputa = Double.parseDouble(a);
		String b = JOptionPane.showInputDialog(null,"Input another number 0 - 100");

		
		 double inputb = Double.parseDouble(b);

		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		 double holder = 0;
		if(inputa > inputb) {
			
		}
		else {
			holder = inputa;
			inputa = inputb;
			inputb = holder;
	
		}
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		int z = test.size();
		for(int i = 0; i<z;i++) {
			double a1 = test.pop();
			if(a1<inputa&&a1>inputb) {
				System.out.println(a1);
			}
		}
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
