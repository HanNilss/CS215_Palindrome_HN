/**
   A class which instantiates a character stack from the Stack library. 
   The goal of the class is to parse a string and determine whether 
   it is a palindrome or not (Ignoring whitespace, case, and punctuation)
   @author hNilsson
   @version 1.0
   CS215
*/
import java.util.Stack;
public class PalindromeParser {
	
	Stack<Character> s;
	
	/**
	 * Creates a PalindromeParser object and a character stack.
	 */
	public PalindromeParser() {
		s = new Stack<>();
	}//end default constructor
	
	/**Checks whether a passed string is a palindrome or not.
	 * Ignores case, punctuation and whitespace
	 * 
	 * @param input string to check
	 * @return T/F whether the string is a palindrome
	 */
	public boolean checkPalindrome(String input) {
		StringBuilder newInput = new StringBuilder("");
		StringBuilder output = new StringBuilder("");

		for (char c: input.toCharArray()) {
			if(Character.isLetter(c)) {
				char lc = Character.toLowerCase(c);
				newInput.append(lc);
				s.push(lc);
			}//end if
		}//end for		
		while (!s.isEmpty()) {
			output.append(s.pop());
		}//end while
		
		return newInput.toString().equals(output.toString());
	}//end checkPalindrome
	
}//end class
