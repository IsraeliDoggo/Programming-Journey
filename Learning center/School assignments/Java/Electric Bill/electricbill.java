/*  electricbill.java
 *  Programmer: Alexander Bentley
 *  Date: September 30, 2023
 *  Platform: VS Code
 * 
 *  Input: kwh Used
 *  Output: amount used in each tier and total cost
 */

import java.util.Scanner;

public class electricbill{

    // declares all constant values used in the program
    public static final int TIER_1_ALLOWANCE = 350;
    public static final int TIER_2_ALLOWANCE = 1450;
    public static final double TIER_1_RATE = 0.23;
    public static final double TIER_2_RATE = 0.29;
    public static final double TIER_3_RATE = 0.45;
    public static final double COMMISSION_TAX = 0.20;

    public static void main (String[] args) {
        
        // declares kWh used and all pricing tiers
        double kwhUsed;
        double tierOneUsage = 0;
        double tierTwoUsage = 0;
        double tierThreeUsage = 0;
        double tierOneBill = 0;
        double tierTwoBill = 0;
        double tierThreeBill = 0;
        double totalBill = 0;

        // create the keyboard object to use the keyboard
        Scanner stdin = new Scanner(System.in);

        // try-catch block
        try {
            System.out.print("Enter KWh used: ");
            kwhUsed = stdin.nextDouble();

            // if negative input is typed
            if ( kwhUsed < 0) {
                System.out.println("Illegal negative input");
                System.exit(1);
            }

            // if kwhUsed is under 350
            if (kwhUsed <= TIER_1_ALLOWANCE) {
                tierOneUsage = kwhUsed;
                tierTwoUsage = 0;
                tierThreeUsage = 0;
            }

            // if kwhUsed is under 1450
            else if (kwhUsed < TIER_2_ALLOWANCE) {
                tierOneUsage = TIER_1_ALLOWANCE;
                tierTwoUsage = kwhUsed - TIER_1_ALLOWANCE;
                tierThreeUsage = 0;
            }

            // anything higher than 1450 will be considered tier 3 pricing
            else {
                tierOneUsage = TIER_1_ALLOWANCE;
                tierTwoUsage = TIER_2_ALLOWANCE - TIER_1_ALLOWANCE;
                tierThreeUsage = kwhUsed - TIER_2_ALLOWANCE;
            }

            tierOneBill = tierOneUsage * TIER_1_RATE;
            tierTwoBill = tierTwoUsage * TIER_2_RATE;
            tierThreeBill = tierThreeUsage * TIER_3_RATE;
            totalBill = tierOneBill + tierTwoBill + tierThreeBill + COMMISSION_TAX;
            }
        
        // catches anything but a number
        catch (Exception e) {
            System.out.println("Illegal non-numeric input");
            stdin.close();
            System.exit(1);
        }

        // display the results
        System.out.printf ("Tier 1 Usage %3.0f kWh: $%-5.2f\n", tierOneUsage, tierOneBill);
        System.out.printf ("Tier 2 Usage %3.0f kWh: $%-5.2f\n", tierTwoUsage, tierTwoBill);
        System.out.printf ("Tier 3 Usage %3.0f kWh: $%-5.2f\n", tierThreeUsage, tierThreeBill);
        System.out.printf ("Energy Commission Tax: $%-1.2f\n", COMMISSION_TAX);
        System.out.printf ("Total Electric Charges: $%-7.2f", totalBill);

        // closes the keyboard object
        stdin.close();
    }
}