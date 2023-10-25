/*  Paycheck.java
 *  Version: 1.2
 *  Date: 9/24/2023
 *  Programmer: Alexander Bentley
 *  Class: CIS084 Java Programming
 * 
 *  Inputs: Quartars, Dimes, Nickels
 * 
 *  computes the total value by multiplying quarters by 0.25, dimes by 0.10 and nickles by 0.05.
 * 
 *  Outputs: Total amount of change
 */
package countingchange;

import java.util.Scanner;

public class CountingChange {

    public static final double QUARTERS = 0.25;
    public static final double DIMES = 0.10;
    public static final double NICKELS = 0.05;
    public static final double PENNIES = 0.01;

    public static void main(String[] args) {

        // declare the variables
        double quarters; // input from keyboard
        double dimes; // input from keyboard
        double nickels; // input from keyboard
        double pennies; // input from keyboard
        double totalChange; // computed variable

        Scanner stdin = new Scanner(System.in); // creates keyboard object to use keyboard

        System.out.println("Alex's Coin Counting Program\n");

        // prompts the user for quarters input
        System.out.println("How many quarters do you have? ");
        quarters = stdin.nextDouble();

        // prompts the user for dimes input
        System.out.println("How many dimes do you have? ");
        dimes = stdin.nextDouble();

        // prompts the user for nickels input
        System.out.println("How many nickels do you have? ");
        nickels = stdin.nextDouble();

        // prompts the user for pennies input
        System.out.println("How many pennies do you have? ");
        pennies = stdin.nextDouble();

        // compute the total amout of change
        quarters *= QUARTERS;
        dimes *= DIMES;
        nickels *= NICKELS;
        pennies *= PENNIES;

        totalChange = quarters + dimes + nickels + pennies;

        System.out.printf("Your total is $%.2f", totalChange);

        stdin.close(); // close the keyboard object
    }
}
