/**
   Test class for palindrome parser which uses a stack to check if a string is a palindrome or not
   @author hNilsson
   @version 1.0
   CS215
*/
public class PalindromeTest {

	public static void main(String[] args) {
		PalindromeParser pp = new PalindromeParser();
		System.out.println("Checking if \"Racecar\" is a palindrome");
		if (pp.checkPalindrome("Racecar")) {
			System.out.println("yes");
		}//end if
		System.out.println("Checking if \"A man, a plan, a canal: Panama.\" is a palindrome");
		if (pp.checkPalindrome("A man, a plan, a canal: Panama.")) {
			System.out.println("yes");
		}//end if
		System.out.println("Checking if \"Toenail\" is a palindrome");
		if (pp.checkPalindrome("Toenail")) {
			System.out.println("yes");
		}//end if
		
	}//end main

}//end class
