import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please insert a number");
		int num = 0;

		while (num > -1) {
			sum += num;
			num = scanner.nextInt();
		}

		System.out.println("Sum is: " + sum);
		scanner.close();
	}
}
