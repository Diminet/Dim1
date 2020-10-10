public class SavingsAccount
{
    private static double annualInterestRate;

    private double savingsBalance = 0.0;
    public SavingsAccount( double savings) {

        savingsBalance = savings;

    }

    public void calculateMonthlyInterest() {

        savingsBalance = savingsBalance + ((savingsBalance * annualInterestRate) / 12);

    }

    public static void modifyInterestRate(double rate) {

        annualInterestRate = rate;

    }
    public String toString() {

        return String.format("%.2f", savingsBalance);

    }

}