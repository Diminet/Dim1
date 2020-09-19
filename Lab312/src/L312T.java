
import java.util.Scanner;

public class L312T {


    public static void main(String[] args) {

        Scanner ss = new Scanner(System.in);

        int quantity;
        double price;

        L312 v1 = new L312("333", "RAM 8GB", 5, 1000.00);
        L312 v2 = new L312("555", "GTX 2080", 8, 2666.00);

        System.out.printf("Invoice amount for v1 => %.2f %n",v1.getPaymentAmount());
        System.out.printf("Invoice amount for invoice2 => %.2f %n",v2.getPaymentAmount());

        System.out.print("Enter quantity for invoice1: ");
        quantity = ss.nextInt();
        System.out.print("Enter item price for invoice1:");
        price = ss.nextDouble();

        v1.setQuantity(quantity);
        v1.setpriceitem(price);

        System.out.print("Enter quantity for invoice2: ");
        quantity = ss.nextInt();
        System.out.print("Enter item price for invoice2:");
        price = ss.nextDouble();

        v2.setQuantity(quantity);
        v2.setpriceitem(price);

        System.out.printf("Invoice amount for invoice1 => %.2f %n",v1.getPaymentAmount());
        System.out.printf("Invoice amount for invoice2 => %.2f %n",v2.getPaymentAmount());

    }

}