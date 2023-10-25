import java.util.Scanner;

public class IntroArrays {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		int[] numbers; // An array for storing the input values.
		int count; // The number of numbers saved in the array.
		int num; // One of the numbers input by the user.
		int i; // for-loop variable.

		numbers = new int[100]; // Space for 100 ints;
		count = 0;

		System.out.println("Enter up to 100 positive integersl; enter 0 to end.");

		while (true) { // Get the numbers and put them in the array
			System.out.print("? ");
			num = stdin.nextInt();

			if (num <= 0) {
				// zero marks the end of input; we have all the numbers.
				break;
			}
			numbers[count] = num; // put num in position count.
			count++;
		}

		System.out.println("\nYour numbers in reverse order are:\n");

		for (i = count - 1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}
	}
}
