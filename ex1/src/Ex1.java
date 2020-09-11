import java.util.Scanner;
public class Ex1 {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int a;
            int b;
            int s,p,sc;
           double d ;

            System.out.print("Enter first integer: ");
            a = input.nextInt();
            System.out.print("Enter second integer: ");
            b = input.nextInt();
            s = a + b;
            sc = a - b;
            p = a * b;
            d = a / (double)b;
            System.out.printf("Sum= %d%n", s);
            System.out.printf("Pro= %d%n", p);
            System.out.printf("Div= %f%n", d);
            System.out.printf("Scd= %d%n", sc);
        }

    }


