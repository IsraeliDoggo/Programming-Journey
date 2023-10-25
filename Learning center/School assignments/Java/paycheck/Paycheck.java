/*  Paycheck.java
 *  Version: 1.2
 *  Date: 9/15/2023
 *  Programmer: Alexander Bentley
 *  Class: CIS084 Java Programming
 * 
 *  Inputs: Employee Name, Hours Worked, Pay Rate
 *  Outputs: Employee Name, Gross Pay, Taxes, Net Pay
 */

import java.util.InputMismatchException;
import java.util.Scanner; // make the keyboard available for use

public class Paycheck { // make sure the file name is Paycheck.java

	// define the constants
	public static final double OVERTIME_RATE = 1.5; // time and a half
	public static final double TAX_RATE = 0.17; // 0.17 is 17%

	public static void main(String[] args) {

		// declare the variables
		String name; // input from the keyboard
		double hours, payRate; // input from the keyboard
		double regHours, overtimeHours; // computed variables
		double regPay, overtimePay; // computed variables
		double grossPay, taxes, netPay; // output to the console

		// create the keyboard object to use the keyboard
		Scanner stdin = new Scanner(System.in);

		// INPUT: hours and payRate
		System.out.print("Enter your name: "); // prompt message
		name = stdin.nextLine(); // keyboard input
		try {
			System.out.print("Enter the hours worked: ");
			hours = stdin.nextDouble();
			System.out.print("Enter the pay rate: ");
			payRate = stdin.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Values for hours and pay rate must be numeric");
			stdin.close();
			return; // no more processing
		}
		if (hours < 0 || payRate < 0) { // test for negative input values
			System.out.println("Inputs must be positive");
			stdin.close(); // no more processing
			return;
		}

		// PROCESS: compute the paycheck
		// separate the regular and overtime hours
		// compute regular, overtime, and tital paycheck
		if (hours <= 40.0) { // less or equal to 40. No overtime
			regHours = hours; // separate regHours and overtimeHours
			overtimeHours = 0.0;
		} else { // over 40. How much is overtime
			regHours = 40.0; // regular pay for the first 40 hours
			overtimeHours = hours - 40.0; // anything over 40 hours
		}
		regPay = regHours * payRate;
		overtimePay = overtimeHours * payRate * OVERTIME_RATE;
		grossPay = regPay + overtimePay;
		taxes = grossPay * TAX_RATE;
		netPay = grossPay - taxes;

		// OUTPUT: name and computed values with two digits past the decimal
		System.out.printf("\n");
		System.out.printf("Name: %s\n", name);
		System.out.printf("Gross pay: $%.2f\n", grossPay);
		System.out.printf("Taxes:     $%.2f\n", taxes);
		System.out.printf("Net pay:   $%.2f\n", netPay);

		stdin.close(); // close the keyboard object
	}
}