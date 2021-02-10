import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Please enter a number");
			int num = scanner.nextInt();
			int lastDigit = num % 10;
			int currentDigit;
			num = num / 10;
			while (num > 0) {
				currentDigit = num % 10;
				if (currentDigit != lastDigit) {
					System.out.println("Not a gold number");
					return;
				}

				num = num / 10;
			}
			System.out.println("Gold number");
		} finally {
			scanner.close();
		}

	}
}
