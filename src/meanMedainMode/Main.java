package meanMedainMode;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
	System.out.println("Enter in your values.");
	Scanner number = new Scanner(System.in);
	String input = number.nextLine();
	String[] strglist = input.split(" ");
	int[] list = new int[strglist.length];
	
	for(int i = 0; i < strglist.length; i ++) {
		try {
			list[i] = Integer.parseInt(strglist[i]);
			System.out.println(list[i]);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	mean(list);
	number.close();
	}
	
	public static void mean(int[] numbers) {
		int sum = IntStream.of(numbers).sum();
		float value = (float)sum / (float)numbers.length;
		System.out.println(value);
	}

	public void median() {
		
	}
	
	public void mode() {
		
	}
}
