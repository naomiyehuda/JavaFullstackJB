import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a number");
		int counter = 10;
		int num;
		while (counter-- > 0) {
			num = scanner.nextInt();

			if (isPalindrom(num)) {
				System.out.format("%d is a palindrom", num);
			} else {
				System.out.format("%d is not a palindrom", num);
			}
			System.out.println();
		}

		scanner.close();
	}

	private static boolean isPalindrom(int num) {
		return num == getOppositNum(num);
	}

	private static int getOppositNum(int num) {
		int opposit = 0;
		int lastDigit = 0;
		while (num > 0) {
			lastDigit = num % 10;
			opposit = opposit * 10 + lastDigit;
			num /= 10;
		}
		return opposit;
	}
}
