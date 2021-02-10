import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please insert a number");
		int num = scanner.nextInt();
		int i;

		if (num == 1) {
			System.out.format("%d is not a prime number", num);
		} else {
			for (i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					break;
				}
			}

			if (i > Math.sqrt(num)) {
				System.out.format("%d is a prime number", num);
			} else
				System.out.format("%d is not a prime number", num);
		}

		scanner.close();
	}
}
