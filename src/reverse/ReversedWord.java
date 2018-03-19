package reverse;


public class ReversedWord {
	
	private String word;

	public ReversedWord(String word) {
		this.word = word;
	}

//print user input
	public void getWord() {
		System.out.println("\nThe word you chose was: " + word + "\n");
	}

//reverse the string input from user	
	public void reverse(){
		StringBuilder sb = new StringBuilder(word);
		String reverse = (sb.reverse().toString());
		System.out.println("The reverse of the word is: " + reverse);
		
	}

}
