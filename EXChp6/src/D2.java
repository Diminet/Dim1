import java.util.Scanner;

public class D2
{
    public static void main ( String [] args)
    {
        Scanner input = new Scanner (System.in);

        double tR=0.0;
        double tax;
        double hours;
        System.out.print("Enter number of hours : " );
        hours=input.nextDouble();
        while (hours >=0.0)
        {
            tax=calculateCharge(hours);
            tR += tax;
            System.out.printf("Current Fee : N%.2f, \nTotal fee: N%.2f\n\n", tax, tR );
            System.out.print("Enter number of hours : ");
            hours=input.nextDouble();
        }
    }
    public static double calculateCharge(double hours)
    {
        double charg = 0.0;
        if (hours <= 3)
        {
            charg = 2;
        }
        if((hours > 3) && (hours < 24))
        {
            charg = 0.50 * (Math.ceil(hours) - 3) + 2;
            if (charg > 10)
            {
                charg = 10;
            }
        }
        if(hours > 24)
        {
            charg = 10;
        }
        return charg;
    }

}

