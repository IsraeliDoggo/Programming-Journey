public class JavaCreditCard {
    public static final double YEARLY_INTEREST_RATE = 22.24 / 100;  // 22.24% = 0.2224
    public static final double MONTHLY_INTEREST_RATE = YEARLY_INTEREST_RATE/12;
    public static final double CREDIT_LIMIT  = 500.00;  // credit limit
    public static final int MAX_MONTHS = 12;        // maximum months to display

    public static void main(String[] args) {
        // Input values
        double balance = 231.96;
        double payment = 35.00;
        double charges = 0.00;

        // Computed values
        double interest;
        double newBalance;
        int month = 1;

        // table column headings
        System.out.printf("%5s  %7s  %8s  %7s  %7s  %11s\n", 
            "Month", "Balance", "Interest", "Payment", "Charges", "New Balance");

        do {
            interest = balance * MONTHLY_INTEREST_RATE;    // based on 12 months in a year
            newBalance = balance + interest + charges - payment;

            // display table values
            System.out.printf("%5d  %7.2f  %8.2f  %7.2f  %7.2f  %11.2f\n", 
                month, balance, interest, payment, charges, newBalance);

            month++;                // update month number
            balance = newBalance;   // transfer newBalance to balance for next computation
        } while (balance >= 0.00);
    }
}
