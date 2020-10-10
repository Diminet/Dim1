public class TSavingsAccount
{
    public static void main(String args[]) {

        SavingsAccount ser1 = new SavingsAccount(2000.00);
        SavingsAccount ser2 = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(.04);
            System.out.println("\n\nInterest Rate = .04%");
            System.out.printf( "%12s%10s\n", "ser1", "ser2" );

        for (int i = 1; i <= 12; i++) {

            String tmp = String.format("Mon %d:", i);
            ser1.calculateMonthlyInterest();
            ser2.calculateMonthlyInterest();

            System.out.printf("%-5s %5s%10s\n", tmp, ser1 , ser2);
        }

            System.out.println("\n\n\n New Interest Rate .05%");
        SavingsAccount.modifyInterestRate(.05);
        ser1.calculateMonthlyInterest();
        ser2.calculateMonthlyInterest();
            System.out.printf("%5s %10s\n", "  rate05 (2000):", ser1 );
            System.out.printf(" %5s %10s\n", " rate05 (3000):", ser2 );

    }
}