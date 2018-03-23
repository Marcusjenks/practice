package vowelCounter;

public class Counter {

	private String word;

	public Counter(String word) {
		this.word = word;
	}

	public void showWord() {
		System.out.println("\nThe word you put in was: " + word);
	}

	public void countVowel() {
		char[] vowel = { 'a', 'e', 'i', 'o', 'u' };

		int j = 0;

		for (int i = 0; i < word.length(); i++) {
			for (int k = 0; k < vowel.length; k++) {
				if (word.charAt(i) == vowel[k])
					j++;
			}
		}

		System.out.print("\nThe number of vowels you have is: " + j);
	}

}
