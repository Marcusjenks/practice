package ninetyNineBottles;

public class Main {

	public static void main(String[] args) {

		for (int i = 99; i >= 0; i--) {
			switch (i) {
			case 0:
				return;
			case 1:
				System.out.println(i + " bottle of beer on the wall! " + i + " one bottle of beer!");
				break;
			default:
				System.out.println(i + " bottles of beer on the wall! " + i + " bottles of beer!");
				break;
			}
			if (i == 1) {
				System.out.println("Take one down pass it around, there are no more bottles of beer on the wall!\n");
			} else if (i == 2) {
				System.out.println("Take one down pass it around, " + (i - 1) + " bottle of beer on the wall!\n");
			} else
				System.out.println("Take one down pass it around, " + (i - 1) + " bottles of beer on the wall!\n");
		}
	}

}
