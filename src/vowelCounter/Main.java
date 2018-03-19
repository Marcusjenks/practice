//A program that will count the vowels in a word.
package vowelCounter;

import reverse.Prompt;

public class Main {

	public static void main(String[] args) {
		Prompt word = new Prompt();
		Counter input = new Counter(word.getString("Type a word and I shall count the vowels!"));
		
		input.showWord();
		input.countVowel();

	}

}
