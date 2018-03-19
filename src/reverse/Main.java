//This program take a string input from the use and reverses it

package reverse;

public class Main {

	public static void main(String[] args) {
		Prompt getWord = new Prompt();
		ReversedWord input =  new ReversedWord(getWord.getString("What is the word you want to reverse?"));
		
		//call method to display input word
		input.getWord();
		//reverse the input word
		input.reverse();
	}

}
