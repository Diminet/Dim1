import java.util.Scanner;

public class M {

    public static void main(String[] arg) {
        double tot = 0.0;
        double km,gal,m,ml;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles travelled : ");
        km = scan.nextDouble();
        ml=km/1.60;
        System.out.println("Enter gallons : ");
        gal= scan.nextDouble();
        m=ml/gal;
        System.out.println("miles per gallons = "+m);
        tot = tot+m;
        System.out.printf("Total miles/gallons: %f\n", tot);

    }

}

