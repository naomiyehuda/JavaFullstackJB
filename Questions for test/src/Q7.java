import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = scanner.nextInt();
		int min = num;

		if (num < 0) {
			System.out.println("There is no minimal number");
		}
		while (num > -1) {
			if (num < min) {
				min = num;
			}

			System.out.println();
			num = scanner.nextInt();
		}
		
		System.out.println("min is: " + min);
		scanner.close();
	}
}
