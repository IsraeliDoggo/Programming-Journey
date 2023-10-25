/*
 * theaterseating.java
 * 
 * Programmer: Alexander Bentley
 * Date: 10/8/2023
 */

import java.util.Scanner;

public class theaterseating {

    // declares all the constant variables.
    public static final double ECONOMY_SEATS = 21.00;
    public static final double STANDARD_SEATS = 30.00;
    public static final double PREMIUM_SEATS = 45.00;
    public static final double SERVICE_CHARGE = 5.00;
    public static final double SALES_TAX = 0.0825;

    public static void main(String[] args) {

        // declares the seat types, subtotal, tax, surcharge and computes the total
        int premiumSeats;
        int standardSeats;
        int economySeats;
        double subTotal = 0;
        double salesTax = 0;
        double surCharge = 0;
        double total = 0;
        boolean inputLoop = true;

        // loops the program if non-numeric input is added
        while (inputLoop == true) {

            // declares the keyboard object
            Scanner stdin = new Scanner(System.in);
            
            // takes user input and checks for non-numeric inputs
            try {

                // loops while number is less than 0
                do {
                    // takes user input for all the seats sold
                    System.out.print("Enter the number of premium seats sold: ");
                    premiumSeats = stdin.nextInt(); 

                    if (premiumSeats < 0)
                        System.out.println("Value must be positive. Try Again");
                } while(premiumSeats < 0);
                
                // loops while number is less than 0
                do {
                    System.out.print("Enter the number of standard seats sold: ");
                    standardSeats = stdin.nextInt();

                    if (standardSeats < 0)
                        System.out.println("Value must be positive. Try Again");
                } while (standardSeats < 0);
                
                // loops while number is less than 0
                do{
                    System.out.print("Enter the number of economy seats sold: ");
                    economySeats = stdin.nextInt();

                    if (economySeats < 0)
                        System.out.println("Value must be positive. Try Again");
                } while (economySeats < 0);

                // closes the keyboard object
                stdin.close();

                subTotal = (premiumSeats * PREMIUM_SEATS) + (standardSeats * STANDARD_SEATS) + (economySeats * ECONOMY_SEATS);  // calculates subtotal
                salesTax = subTotal * SALES_TAX;   // calculates salestax
                surCharge = SERVICE_CHARGE;        // calculates surcharge
                total = subTotal + salesTax + SERVICE_CHARGE;   // calculates total

                inputLoop = false;  // ends the loop
            }
            
            // catches anything but a number
            catch (Exception e) {
                System.out.println("Illegal non-numeric input");
                inputLoop = true;

            }
        }
        
        // displays the results
        System.out.printf ("Subtotal:  $%-7.2f\n", subTotal);
        System.out.printf ("Tax:       $%-7.2f\n", salesTax);
        System.out.printf ("Surcharge: $%-1.2f\n", surCharge);
        System.out.printf ("total:     $%-7.2f", total);

    }
}
