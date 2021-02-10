import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		int n = scanner.nextInt();
		int counter = n;
		int fact = 1;

		while (counter > 1) {
			fact *= counter;
			counter--;
		}
		System.out.format("Factorial number of %d is %d", n, fact);

		scanner.close();
	}
}
