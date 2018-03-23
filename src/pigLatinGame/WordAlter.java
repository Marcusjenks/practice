package pigLatinGame;

public class WordAlter {

	private String word;

	public WordAlter(String word) {
		this.word = word;
	}

	public void getWord() {
		System.out.println("\nThe original word is: " + word + "\n");
	}

	public void convert() {
		char[] special = { 'a', 'e', 'i', 'o', 'u' };
		// Get the first character of input word
		char move = word.charAt(0);

		// Check the first character of the word to see if it is a vowel
		for (int i = 0; i < special.length; i++) {
			if (move == special[i]) {
				System.out.println("Pig Latin: " + word + "way");
				return;
			}
		}

		// Remove the first character of the word
		word = word.substring(1);
		System.out.println("Pig Latin: " + word + move + "ay");
	}

}
