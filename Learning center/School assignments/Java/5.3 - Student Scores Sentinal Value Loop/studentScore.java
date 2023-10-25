
/*
 * studentScore.java
 * 
 * Programmer: Alexander Bentley
 * Date: 10/15/2023
 */
import java.util.Scanner;

public class studentScore {
	public static final int MAX_SCORE = 100;

	public static void main(String[] args) {
		// declares input variables
		double score;
		double total = 0.0;
		double average;
		int studentCount = 0;

		// creates the Scanner object
		Scanner stdin = new Scanner(System.in);

		// title at the top of the output
		System.out.println("Find the average score of several student");
		System.out.println("Enter -1 when done");

		System.out.printf("Enter the score for student #%d: ", studentCount + 1);
		score = stdin.nextDouble();

		// if the first score entered was -1, exits program
		if (studentCount == 0 && score == -1) {
			System.out.println("no scores were entered");
			stdin.close();
			System.exit(1);
		}

		while (score != -1) {
			total += score;
			studentCount++; // increment the loop counter
			System.out.printf("Enter the score for student #%d: ", studentCount + 1);

			// inputs the next students score
			score = stdin.nextDouble();

			// asks for student score while the score inputted is greater than 100.
			while (score > MAX_SCORE) {
				System.out.println("invalid score. Try again");
				System.out.printf("Enter the score for student #%d: ", studentCount + 1);

				// inputs the next students score
				score = stdin.nextDouble();
			}
		} // end of for loop

		// computes the average score.
		average = total / studentCount;
		System.out.printf("\n%d student scores were entered\n", studentCount);
		System.out.printf("the Average score was %-8.2f", average);

		stdin.close(); // closes keyboard object
	}
}
