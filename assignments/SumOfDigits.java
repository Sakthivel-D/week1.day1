package week1.day1.assignments;

public class SumOfDigits {

	public static void main(String[] args) {

		int num = 253, sum = 0, remainder;

		while (num != 0) {
			remainder = num % 10;
			sum = remainder + sum;
			num = num / 10;
		}

		System.out.println("Count of the number is : " + sum);

	}

}