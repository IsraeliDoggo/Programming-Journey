/*
     The program simulates the flipping of a coin and always wins by cheating.
*/

import java.util.Scanner; 

public class CoinFlip {
    public static void main(String[] args) {

        // create the variables and the Scanner object
        Scanner stdin = new Scanner(System.in);
        boolean playAgain;
         
        do {
            System.out.println ("Heads I win. Tails you lose");
            
            boolean coin = Math.random( ) >= 0.5; // random number >= 0.5 --> true

            if (coin == true) 
                System.out.println ("It was heads. I win");
            else
                System.out.println ("It was tails. You lose");
                
            System.out.print ("\nDo you want to play again (Y/N)? ");

            String response = stdin.nextLine();  // read line from keyboard
            playAgain = response.length() == 0 || response.charAt(0) == 'y';

        } while (playAgain);  // accept [Enter] or anything that starts with 'y'
        
        stdin.close();
    } // end of void main

} // end of class


