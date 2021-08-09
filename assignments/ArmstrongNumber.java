package week1.day1.assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int input = 153;

		int calculated = 0, remainder, original;

		original = input;

		while (input > 0) {
			remainder = input % 10;
			input = input / 10;
			int cube = remainder * remainder * remainder;
			calculated = cube + calculated;
		}

		if (original == calculated) {
			System.out.println("Armstrong Number");
		}

		System.out.println("Original:" + original + ".......... Caluclated: " + calculated);

	}

}