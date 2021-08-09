package week1.day1.assignments;

public class PrimeNumbers {

	public static void main(String[] args) {

		int input = 11;

		boolean flag = false;

		for (int i = 2; i <= input / 2; i++) {

			int remainder = input % i;

			if (remainder == 0) {
				flag = true;
				break;
			}
		}

		if (flag)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");
	}
}
