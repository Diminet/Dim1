import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;
        int sum,pr,med;
        System.out.print("Intr 1 num: ");
        x = input.nextInt();

        System.out.print("Intr 2 num: ");
        y = input.nextInt(); //

        System.out.print("Intr 3 num: ");
        z = input.nextInt();
///max
        if (x > y )
            if (x < z)
                System.out.printf("max=%d  %n", z);
            else
                System.out.printf("max=%d  %n", x);
        else
        if (y<z)
            System.out.printf("max=%d  %n", z);
        else
            System.out.printf("max=%d  %n", y);

///min

        if (x < y )
            if (x > z)
                System.out.printf("min=%d  %n", z);
            else
                System.out.printf("min=%d  %n", x);
        else
        if (y>z)
            System.out.printf("min=%d  %n", z);
        else
            System.out.printf("min=%d  %n", y);

///calc
        sum = z + y + x;
        pr = z * x * y;
        med= (z + y + x)/3;

        System.out.printf("sum= %d %n", sum);
        System.out.printf("pr= %d  %n", pr);
        System.out.printf("med= %d  %n", med);
    }
}
