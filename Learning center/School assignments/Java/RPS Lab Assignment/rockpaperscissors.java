/* rockpaperscissors.java
*  Alexander Bentley
*  September 25, 2023
*/

import java.util.Scanner;


public class rockpaperscissors {
    public static void main(String[] args){

        // declaring the varaibles
        char playerOne = ' ';
        char playerTwo = ' ';

        Scanner stdin = new Scanner(System.in); // creates keyboard object for user input

        System.out.println("Welcome to Rock Paper Scissors, select R, P, S, or Q to quit!");
        do {
            System.out.println("Player 1: ");
            playerOne = stdin.next().toUpperCase().charAt(0);
            if (playerOne == 'Q')
                continue;   // exits the loop
            
            System.out.println("Player 2: ");
            playerTwo = stdin.next().toUpperCase().charAt(0);
            if (playerTwo == 'Q')
                continue;   //exits the loop

            // Player 1 chooses R
            if (playerOne == 'R') {
                if (playerTwo == 'P')
                    System.out.println("Player 2 wins!");
                
                else if (playerTwo == 'S')
                    System.out.println("Player 1 wins!");
                
                else if (playerTwo == 'R')
                    System.out.println("Tie Game! nobody wins.");
                
                else
                    System.out.println("Invalid Entry for player 2");
            }

            // Player 1 chooses P
            else if (playerOne == 'P') {
                if (playerTwo == 'P')
                    System.out.println("Tie Game! nobody wins.");
                
                else if (playerTwo == 'S')
                    System.out.println("Player 2 wins!");
                
                else if (playerTwo == 'R')
                    System.out.println("Player 1 wins!");
                
                else
                    System.out.println("Invalid Entry for player 2");
            }

            // Player 1 chooses S
            else if (playerOne == 'S'){
                if (playerTwo == 'P')
                    System.out.println("Player 1 wins!");
                
                else if (playerTwo == 'S')
                    System.out.println("Tie Game! nobody wins.");
                
                else if (playerTwo == 'R')
                    System.out.println("Player 2 wins!");
                
                else
                    System.out.println("Invalid Entry for player 2");
            }

            // player 1 inputs none of the options
            else{
                System.out.println("Invalid entry For player 1");
            }

        } while (playerOne != 'Q' && playerTwo != 'Q'); // loops as long as one player is playing

        stdin.close();  // closes keyboard object
    }
}
