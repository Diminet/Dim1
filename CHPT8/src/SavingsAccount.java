public class SavingsAccount
{
    private static double InterestRate;

    private double savingsBalance = 0.0;
    public SavingsAccount( double savings) {

        savingsBalance = savings;

    }

    public void calculateMonthlyInterest() {

        savingsBalance = savingsBalance + ((savingsBalance * InterestRate) / 12);

    }

    public static void modifyInterestRate(double rate) {

        InterestRate = rate;

    }
    public String toString() {

        return String.format("%.2f", savingsBalance);

    }

}
