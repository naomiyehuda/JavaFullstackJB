import java.util.Scanner;
import java.util.Arrays;
public class Q10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a number");
		int counter = 0;
		int[] intArray = new int[3];
		while (counter < 3) {
			intArray[counter] = scanner.nextInt();
		}

		Arrays.sort(intArray);
		System.out.format("%d is the minimal number", intArray[0]);

		scanner.close();
	}
}
