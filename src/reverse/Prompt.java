//Get user input class

package reverse;

import java.util.Scanner;

public class Prompt {
	private Scanner scanner;

	public Prompt() {
		scanner = new Scanner(System.in);
	}

	// Get input from user as a string
	public String getString(String prompt) {
		System.out.println(prompt);
		return scanner.nextLine();
	}

}
