package palindrome;

public class Palindrome {
	
	private String word;

	public Palindrome(String word) {
		this.word = word;
	}
	
	public void isPalindrome() {
		StringBuilder sb = new StringBuilder(word);
		String reverse = (sb.reverse().toString());
		if (word.equals(reverse)) {
			System.out.println("\nThis word is palindrome! :D");
		}
		else {
			System.out.println("\nThis word is not palindrome :(");
		}
	}
}
