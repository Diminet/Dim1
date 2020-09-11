import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Intr 1 num: ");
        a = input.nextInt();
        System.out.print("Intr 1 num: ");
        b = input.nextInt();
        if (a == b)
            System.out.printf("%d == %d Aceste numere sunt egale %n", a, b);
        if (a < b)
            System.out.printf("%d  este mai mare%n",  b);
        if (a > b)
            System.out.printf("%d este mai mare%n", a);


    }
}
