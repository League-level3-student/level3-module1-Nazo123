package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		boolean work = false;
		Stack<String> a = new Stack<String>();
		for(int i = 0; i<b.length();i++) {
		
		if((b.charAt(i)+"").equals("{")) {
		a.push("{");
		}
		else if(a.size()>0) {
		a.pop();
		}
		else {
			return work;
		}
			
				
		}
		if(a.size()==0){
			work = true;
		}
			
		
	
		return work;
	}

}