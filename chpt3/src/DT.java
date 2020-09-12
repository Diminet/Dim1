import java.util.Scanner;
public class DT {



        public static void main(String[] args) {

            T check1 = new T(112, "Book", 3, 125.98);
            T check2 = new T(101, "Phone", 2, 456.35);
            T check3 = new T(187, "Laptop", 1, 2345.68);

            items(check1,check2, check3);
        }

        public static void items(T chk1, T chk2, T chk3)
        {
            Scanner sn = new Scanner(System.in);
            //-----------------------------------------------------------
            System.out.println("Please enter Item Number: ");
            chk1.setitem_number(sn.nextInt());

            System.out.println("Please enter Item Name: ");
            chk1.setname(sn.next());

            System.out.println("Please enter quantity: ");
            chk1.setquantity(sn.nextInt());

            System.out.println("Please enter price: ");
            chk1.setprice(sn.nextDouble());
            //-----------------------------------------------------------

            //-----------------------------------------------------------
            System.out.println("Please enter Item Number: ");
            chk2.setitem_number(sn.nextInt());

            System.out.println("Please enter Item Name: ");
            chk2.setname(sn.next());

            System.out.println("Please enter quantity: ");
            chk2.setquantity(sn.nextInt());

            System.out.println("Please enter price: ");
            chk2.setprice(sn.nextDouble());
            //-----------------------------------------------------------

            //-----------------------------------------------------------
            System.out.println("Please enter Item Number: ");
            chk3.setitem_number(sn.nextInt());

            System.out.println("Please enter Item Name: ");
            chk3.setname(sn.next());

            System.out.println("Please enter quantity: ");
            chk3.setquantity(sn.nextInt());

            System.out.println("Please enter price: ");
            chk3.setprice(sn.nextDouble());
            //-----------------------------------------------------------

            chk1.displayLine();
            chk2.displayLine();
            chk3.displayLine();
        }

    }

