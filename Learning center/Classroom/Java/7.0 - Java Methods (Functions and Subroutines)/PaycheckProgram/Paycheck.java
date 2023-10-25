package PaycheckProgram;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Paycheck {
	// define the constants
	public static final double OVERTIME_RATE = 1.5; // time and a half
	public static final double TAX_RATE = 0.17; // 0.17 is 17%

	public static void main(String[] args) {
		// declare the variables
		String name; // input from the keyboard
		double hours; // input from the keyboard
		double payRate; // input from the keyboard
		double grossPay; // calculated from function
		double taxes; // calculated from grosspay
		double netPay; // output to the console

		// create the keyboard object to use the keyboard
		Scanner stdin = new Scanner(System.in);

		// INPUT: hours and payRate
		System.out.print("Enter your name: "); // prompt message
		name = stdin.nextLine(); // keyboard input
		System.out.print("Hello, " + name + ", ");
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

		grossPay = computeGrossPay(hours, payRate);
		taxes = grossPay * TAX_RATE;
		netPay = grossPay - taxes;

		// OUTPUT: name and computed values with two digits past the decimal
		System.out.printf("%n");
		System.out.printf("Name: %s%n", name);
		System.out.printf("Gross pay: $%.2f%n", grossPay);
		System.out.printf("Taxes:     $%.2f%n", taxes);
		System.out.printf("Net pay:   $%.2f%n", netPay);

		stdin.close(); // close the keyboard object
	}

	private static double computeGrossPay(double hours, double payRate) {
		// compute the regHours and overtimeHours
		double regHours;
		double overtimeHours;

		if (hours <= 40) { // less or = to 40 hours, then
			regHours = hours; // all hours are regular
			overtimeHours = 0.0; // with no overtime
		} else { // over 40 hours, then
			regHours = 40.0; // first 40 at regular pay
			overtimeHours = hours - 40.0; // anything over 40
		}

		// compute the paycheck
		double regPay = regHours * payRate;
		double overtimePay = overtimeHours * payRate * OVERTIME_RATE;

		return regPay + overtimePay;
	} // end of computeGrossPay() method
}
