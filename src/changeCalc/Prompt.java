package changeCalc;

import java.math.BigDecimal;
import java.util.Scanner;

public class Prompt {
	private Scanner number;

	public Prompt() {
		number = new Scanner(System.in);
	}

	public BigDecimal money() {
		BigDecimal m = new BigDecimal(0);
		
		try {
			m = number.nextBigDecimal();
		} catch (Exception e) {
			System.out.println("Wrong input! Please use correct input!");
		}

		return m;
	}
}
