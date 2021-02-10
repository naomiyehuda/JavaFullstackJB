import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int res = num1;

		if (num2 == 0)
			res = 1;
		else
			for (int i = 1; i < num2; i++) {
				res *= num1;
			}

		System.out.format("%d power %d is: %d", num1, num2, res);

		scanner.close();
	}
}
