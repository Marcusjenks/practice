package addCalculator;

import reverse.Prompt;

public class Main {

	public static void main(String[] args) {

		Prompt numbers = new Prompt();
		String input = numbers.getString("Enter in two numerical values you wish to add.");
		String[] adderstrg = input.split(" ");
		int[] adder = new int[adderstrg.length];
		
		for(int i = 0;i < adderstrg.length; i++) {
			try {
				adder[i] = Integer.parseInt(adderstrg[i]);
			}
			catch(Exception e){
				e.printStackTrace();

			}
		}
		
		System.out.println(adder[0] + adder[1]);

	}
}