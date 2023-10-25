/*
 * rollingdice.java
 * Programmer: Alexander Bentley
 * Date: 10/22/2023
 * Version: 1.0
 */
public class rollingdice {
	public static final int ROLL_COUNT = 1000;

	public static void main(String[] args) {
		int[] pointCount = new int[13]; // creates an array and stores the count.

		// rolls the dice 1000 times and stores the count for each number
		for (int i = 0; i < ROLL_COUNT; i++) {
			int diceRoll = rollDice();
			pointCount[diceRoll]++;
		}

		// prints the final results
		System.out.println("1000 Dice Rolls \n Value  Count");
		for (int i = 2; i <= 12; i++) {
			// display the index i and the contents of the array
			System.out.printf("%3d     %3d\n", i, pointCount[i]);
		}
	}

	static int roll(int faceCount) { // roll one Die (die is the singular of dice)
		int dotCount = (int) (Math.random() * faceCount) + 1;
		return dotCount; // add 1 because rand starts at zero
	}

	// roll dice function
	static int rollDice() {
		int die1 = roll(6);
		int die2 = roll(6);
		return die1 + die2;
	}
}
