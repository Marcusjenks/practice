package higherLower;

import reverse.Prompt;

public class Main {

	public static void main(String[] args) {
		int high = 100, low = 0;
		Prompt ask = new Prompt();

		System.out.println("I am going to guess your number! Think of a number between 0 and 100!");

		int guess = (high + low) / 2;

		String response = ask.getString("Is the number: " + guess + " OR is it (h)igher or (l)ower?");
		int counter = 0;

		boolean game = true;
		while (game) {
			counter++;
			switch (response) {
			case "y":
				game = false;
				System.out.println("I knew I would get it! and it only took me (" + counter +") tries!");
				return;
			case "h":
				low = guess;
				break;
			case "l":
				high = guess;
				break;
			default:
				System.out.println("Please input a proper response!");
			}
			guess = (high + low) / 2;
			response = ask.getString("Is the number: " + guess + " OR is it (h)igher or (l)ower?");

		}

	}

}
