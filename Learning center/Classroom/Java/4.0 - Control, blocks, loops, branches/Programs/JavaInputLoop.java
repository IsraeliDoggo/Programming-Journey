/*
    This program inputs an integer, doubles it and displays the result.
    Negative inputs and input mismatches are rejected. A type mismatch 
    occurs if anything except an integer is entered. A do...while loop is  
    used to keep asking for the input until a positive integer is entered.
    Dan McElroy  --  San Jose City College
 */

import  java.util.Scanner; // used to read from keyboard
import  java.util.InputMismatchException;

public class JavaInputLoop {
    public static void main(String[] args) {

        Scanner stdin = new Scanner (System.in);

        int num1 = 0;   // the value input from the console
        int sum ;        // computed to be num*2 and then displayed
        boolean keepTrying; // flag when true keeps the loop going
        
        System.out.printf("Enter a positive integer: ");   // prompt

        do {
            keepTrying = false; // assume no error

            try {
                // Throw an exception if there is a data type mismatch
                num1 = stdin.nextInt();    // input value from the keyboard

                if (num1 < 0) {
                    System.out.printf("Value must be positive. Try again: ");
                    keepTrying = true;
                }
            }
            catch (InputMismatchException e) {
                stdin.nextLine( );   // get rid of the rest of the line
                System.out.printf("Only integers are accepted. Try again: ");
                keepTrying = true;
            }

        } while (keepTrying);

        // We get to this point when a positive integer has been entered
        sum = num1 * 2;
        System.out.printf ("The value %d doubled is %d\n", num1, sum);

        stdin.close();
    } // end of main( )

} // end of class Java Input Loop 