package fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		System.out.println("How many numbers do you want in the fibonacci sequence");
		int passes = input.nextInt();
		List<Integer> fibonacci = new ArrayList<Integer>();
		int number = 1, term;

		for (int i = 0; i <= (passes - 1); i++) {
			switch (i) {
			case 0:
				fibonacci.add(0);
				break;
			case 1:
				fibonacci.add(1);
				break;
			case 2:
				fibonacci.add(1);
				break;
			default:
				number += fibonacci.get(i - 2);
				fibonacci.add(number);
			}

		}
		
		System.out.println("What nth term shall we display");
		term = input2.nextInt();
		System.out.println("Fibonacci sequence number : " + fibonacci.get(term));

		input.close();
		input2.close();
	}

}
