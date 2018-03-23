package pigLatinGame;

import reverse.Prompt;

public class Main {

	public static void main(String[] args) {

		Prompt word = new Prompt();
		WordAlter input = new WordAlter(word.getString("What is the word you want to alter?"));

		// call method to show input word
		input.getWord();
		// call method to convert word to pig latin
		input.convert();

	}

}
