import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int counter = 0;
		int sumOdd = 0;
		int sumEven = 0;
		int num = 0;

		System.out.println("Please enter 100 numbers");
		while (counter++ < 100) {			
			num = scanner.nextInt();
			if (isEven(num)) {
				sumEven += num;
			} else {
				sumOdd += num;
			}

		}

			System.out.format("The highest sum is: %d", Math.max(sumEven, sumOdd));

		scanner.close();
	}

	private static boolean isEven(int num) {
		return num % 2 == 0;
	}
}
