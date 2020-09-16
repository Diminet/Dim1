import java.util.Scanner;

public class CreditLimitCalculatorTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CreditLimitCalculator cd = new CreditLimitCalculator();

        int nracc, balance, charg, cred, credit_limit;
        int i,n;

        n=requestInput("Enter the number of people: " , sc);
for (i=0;i<n;i++) {
    System.out.print("Enter account number: ");
    nracc = sc.nextInt();

    balance = requestInput("Enter balance at the beginning of the month " + nracc + ": ", sc);
    charg = requestInput("Enter total monthly charges for account" + nracc + ": ", sc);
    cred = requestInput("Enter total monthly credits for account " + nracc + ": ", sc);
    credit_limit = requestInput("Enter allowed credit limit " + nracc + ": ", sc);

    cd.setAccountInfo(nracc, balance,
            charg, cred, credit_limit);


    System.out.printf("\n\nCREDIT INFORMATION FOR ACCOUNT %d\n", nracc);

    System.out.printf("Balance: %d\n", cd.getBalance());
    System.out.printf("Credit Limit: %d\n", cd.getcredit_limit());
    System.out.printf("Total Charges: %d\n", cd.getcharg());
    System.out.printf("Total Credits: %d\n", cd.getCred());
    System.out.printf("New Balance: %d\n", cd.getNBalance());

    if (cd.creditExceeded())
        System.out.println("Credit limit exceeded.");

}

    }
    public static int requestInput(String s, Scanner sc){
        System.out.print(s);
        return sc.nextInt();
    }
}