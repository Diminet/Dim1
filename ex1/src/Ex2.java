import java.util.Scanner;
public class Ex2 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        double km = Double.parseDouble(arg[0]);
        System.out.println("kilo meters travelled is: "+km);
        double m=km/1.609344;
        double g = Double.parseDouble(arg[1]);
        System.out.println("Gallons used : "+g);
        double mpg=m/g;
        System.out.print("Miles per gallons = "+mpg);

    }
}
