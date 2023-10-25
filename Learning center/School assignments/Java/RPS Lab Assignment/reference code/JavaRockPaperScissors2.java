/* JavaRockPaperScissors.java
   Dan McElroy
   This version of the program uses Scanner for keyboard input
   CIS084 - Java Programming
   Date: 8/17/2018
*/

import java.util.Scanner;      // if not using TextIO

public class JavaRockPaperScissors2 {

    public static void main(String[] args) {
        // list of variables
        char player1 = ' ';     // input for Player 1
        char player2 = ' ';     // input for Player 2
         
        // Create the Scanner stdin object (if not using TextIO)
        Scanner stdin = new Scanner(System.in);

        System.out.println ("Enter R P, S or Q for rock, paper, scissors or quit");
        do
        {
            System.out.print ("Player 1 (R P S): ");
            player1 = stdin.next().toUpperCase().charAt(0);
            if (player1 == 'Q') //  quit?
               continue;  // go directly to the end of the do loop

            System.out.print ("Player 2 (R P S): ");
            player2 = stdin.next().toUpperCase().charAt(0);
            if (player2 == 'Q')  // quit?
                continue;   // go directly to the end of the do loop

            if (player1 == 'R')	 // what happens if player1 selects ROCK?
            {
                if (player2 == 'R')
                    System.out.println ("Nobody wins");
                else if (player2 == 'P')
                    System.out.println ("Paper covers rock - player 2 wins");
                else if (player2 == 'S')
                    System.out.println ("Rock breaks scissors - player 1 wins");
                else
                    System.out.println ("Illegal entry for player 2");
            }

            // ---- you need to complete the code for player1 entering P or S

            else
                System.out.println ("Illegal entry for player 1");

        } while (player1 != 'Q' && player2 != 'Q'); // loop as long as neither is a 'Q'

        stdin.close();
    } // end of public static void main(String[] args)
} // end of public class JavaRockPaperScissors
