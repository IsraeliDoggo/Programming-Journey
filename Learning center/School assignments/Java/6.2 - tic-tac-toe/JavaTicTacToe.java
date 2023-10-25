// Program Name: TicTacToe
// Programmer:   Dan McElroy
// Finishing Programmer: Alexander Bentley
// Class:        CIS-084 Java Programming
// Date:         March 2, 2021
// Updated:      October 22, 2023
// Version:      1.1

import java.util.Scanner;

public class JavaTicTacToe {
	static char[][] board = { // index for positions in the array
			{ '1', '2', '3' }, // [0][0] [0][1] [0][2]
			{ '4', '5', '6' }, // [1][0] [1][1] [1][2]
			{ '7', '8', '9' } // [2][0] [2][1] [2][2]
	};

	public static void main(String[] args) {
		int squareCounter = 0; // count how many squares are used
		char gameWinner = '-'; // winner of the game ('X' or 'O')
		char inputCharacter; // input from the user (should be '1' to '9')
		int choice; // input converted to integer 0 to 8 (start from 0)
		char player; // current player, set to either an 'X' or an 'O'

		// create the Scanner object
		Scanner stdin = new Scanner(System.in);

		// select the starting player
		// Math.random() gives a double number between 0.0 and less than 1.0
		int selectFirstPlayer = (int) (Math.random() * 2); // value 0 or 1
		if (selectFirstPlayer % 2 == 1)
			player = 'X';
		else
			player = 'O';
		System.out.println("The starting player is using " + player);

		// starting instructions
		System.out.println("Enter a 1 though 9  to select a square");

		// Ask for a 1-9 until all squares are filled or the game has been won
		while (squareCounter < 9 && gameWinner != 'X' && gameWinner != 'O') {
			System.out.println("===============");
			System.out.println("  TIC TAC TOE");
			System.out.println("===============");
			displayTicTacToe(board);
			System.out.print("Player " + player + ", enter a number (1-9): ");
			inputCharacter = stdin.next().charAt(0);

			// Arrays start counting from index 0
			// convert inputCharacter from ASCII ('1' to '9') to integer (0 to 8)
			// to select the row and column index for the 3x3 array
			choice = inputCharacter - '1'; // now the inputs are 0,1,2,3,4,5,6,7,8
			int row = choice / 3; // row will be 0 (for 0,1,2), 1 (for 3,4,5), 2 for (6,7,8)
			int col = choice % 3; // col will be 0 (for 0,3,6), 1 (for 1,4,7), 2 for (2,5,8)

			if (choice < 0 || choice > 8) // see if the input is below 1 or greater than 0
				System.out.println("Illegal value, try again");
			else if (board[row][col] == 'X' || board[row][col] == 'O')
				System.out.println("This space has already been used, try again");
			else {
				board[row][col] = player; // put in an 'X' or an 'O'
				squareCounter++; // count the number of squares completed
				// select the next player
				if (player == 'X')
					player = 'O'; // switch from 'X' to 'O' for next move
				else
					player = 'X'; // switch from 'O' to 'X' for next move
			}
			gameWinner = checkForWinningGame(board); // returns 'X' or 'O' if the game is won
		} // end of while( )

		// The game is over. Either the game has been won or no more squares
		displayTicTacToe(board);
		System.out.println(""); // blank line
		if (gameWinner == 'X' || gameWinner == 'O')
			System.out.printf("Player %c wins the game\n\n", gameWinner);
		else
			System.out.printf("Tie game\n\n");
		stdin.close();
	} // end of public static void main(String[] args)

	// ------ Display the Tic Tac Toe board
	public static void displayTicTacToe(char[][] board) {
		System.out.println(""); // display an empty line
		for (int row = 0; row < 3; row++) // display three rows
		{
			if (row == 0) {
				System.out.println("     |   |");
			}
			if (row == 1) {
				System.out.println("  ___|___|___\n     |   |");
			}
			if (row == 2) {
				System.out.println("  ___|___|___\n     |   |");
			}
			for (int col = 0; col < 3; col++) { // display three columns each row
				if (col == 0) {
					System.out.printf("   %c |", board[row][col]);
				}
				if (col == 1) {
					System.out.printf(" %c |", board[row][col]);
				}
				if (col == 2) {
					System.out.printf(" %c ", board[row][col]);
				}
			}
			System.out.println(""); // end of row
		}
		System.out.println("     |   |"); // display an empty line
	} // end of displayTicTacToe(...)

	// ------ Check all eight possible combinations for a win.
	// returns the player ('X' or 'O') if the game has been won
	// returns '-' if there is currently no winner
	public static char checkForWinningGame(char[][] board) {
		char player;

		// check going across the top row to see if all squares are the same
		player = board[0][0];
		if (board[0][1] == player && board[0][2] == player)
			return player;
		// check going across the middle row to see if all squares are the same
		player = board[1][0];
		if (board[1][1] == player && board[1][2] == player)
			return player;
		// check going across the bottom row to see if all squares are the same
		player = board[2][0];
		if (board[2][1] == player && board[2][2] == player)
			return player;
		// check going down the first column to see if all squares are the same
		player = board[0][0];
		if (board[1][0] == player && board[2][0] == player)
			return player;
		// check going down the second column to see if all squares are the same
		player = board[0][1];
		if (board[1][1] == player && board[2][1] == player)
			return player;
		// check going down the third column to see if all squares are the same
		player = board[0][2];
		if (board[1][2] == player && board[2][2] == player)
			return player;
		// check going across the left diagonal \ to see if all squares are the same
		player = board[0][0];
		if (board[1][1] == player && board[2][2] == player)
			return player;
		// check going across the right diagonal / to see if all squares are the same
		player = board[0][2];
		if (board[1][1] == player && board[2][0] == player)
			return player;

		return '-'; // if there is no winner
	} // end of checkForWinningGame(...)

} // end of class