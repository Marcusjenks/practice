package palindrome;

import reverse.Prompt;

public class Main {

	public static void main(String[] args) {
		Prompt word = new Prompt();
		Palindrome input = new Palindrome(word.getString("Enter a word to see if it is palindrome!"));

		input.isPalindrome();

	}

}
