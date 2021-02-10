import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = scanner.nextInt();

		while (num > -1) {
			for (int i = 0; i < num; i++) {
				System.out.print("*");
			}
			
			System.out.println();
			num = scanner.nextInt();
		}
		scanner.close();
	}
}
