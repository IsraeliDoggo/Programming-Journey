/*
 * CreditCardPayoff.java
 * 
 * Programmer: Alexander Bentley
 * Date: 10/15/2023
 */

import java.util.Scanner;

public class CreditCardPayoff {

    // declares constant variables
    public static final double YEARLY_INTEREST_RATE = 22.24 / 100;  // 22.24% = 0.2224
    public static final double MONTHLY_INTEREST_RATE = YEARLY_INTEREST_RATE/12;
    public static final double CREDIT_LIMIT  = 500.00;  // credit limit
    public static final int MAX_MONTHS = 12;        // maximum months to display
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        // inputted values
        double balance;
        double payment;
        double charges;

        // computed values
        double interest;
        double balanceBeforePayment;
        double newBalance;
        int month = 1;

        // takes input from user for balance, payment, and charges
        System.out.print("What is your current balance: ");
        balance = stdin.nextDouble();

        System.out.print("How much are you paying each month: ");
        payment = stdin.nextDouble();

        System.out.print("Any additional charges: ");
        charges = stdin.nextDouble();

        // table column headings
        System.out.printf("%5s  %7s  %8s  %7s  %7s  %11s\n", 
            "Month", "Balance", "Interest", "Payment", "Charges", "New Balance");
        
        do {
            interest = balance * MONTHLY_INTEREST_RATE;    // based on 12 months in a year
            balanceBeforePayment = balance + interest + charges;

            // checks to see if balance is greater than payment to prevent balance from going below 0
            if (balanceBeforePayment > payment) {
                newBalance = balanceBeforePayment - payment;

                // if the balance goes over the credit limit
                if (newBalance > CREDIT_LIMIT) {
                    // display table values
                    System.out.printf("%5d  %7.2f  %8.2f  %7.2f  %7.2f  %11.2f\n", 
                        month, balance, interest, payment, charges, newBalance);

                    System.out.println("Balance is greater than the credit limit");
                    System.exit(1);     // exits the program
                }
                else {
                    // display table values
                    System.out.printf("%5d  %7.2f  %8.2f  %7.2f  %7.2f  %11.2f\n", 
                        month, balance, interest, payment, charges, newBalance);

                    month++;                // update month number
                    balance = newBalance;   // transfer newBalance to balance for next computation
                }
            }
            // balance is less than payment.
            else if (balanceBeforePayment < payment) {
                payment = balanceBeforePayment;
                newBalance = balanceBeforePayment - payment;

                // display table values
                System.out.printf("%5d  %7.2f  %8.2f  %7.2f  %7.2f  %11.2f\n", 
                    month, balance, interest, payment, charges, newBalance);

                balance = newBalance;
                System.out.println("Balance is zero");
            }
        } while (balance > 0.00 && month <= MAX_MONTHS);    // runs until the condition is met

        stdin.close();      // closes keyboard object
    }
}