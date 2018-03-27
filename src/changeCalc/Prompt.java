package changeCalc;

import java.math.BigDecimal;
import java.util.Scanner;

public class Prompt {
	private Scanner line;

	public Prompt() {
		line = new Scanner(System.in);
	}

	public BigDecimal money(String prompt) {
		System.out.println(prompt);

		BigDecimal m = new BigDecimal(0);
		
		try {
			m = line.nextBigDecimal();
		} catch (Exception e) {
			System.out.println("Wrong input! Please use correct input!");
		}

		return m;
	}
	
	public String getString(String prompt) {
		System.out.println(prompt);
		return line.nextLine();
	}

}
