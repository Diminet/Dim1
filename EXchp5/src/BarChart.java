import java.util.Scanner;


public class BarChart {
   public static void main(String args[]) {
   int n1, n2, n3, n4, n5;

   Scanner sss = new Scanner(System.in);
   System.out.println("Write the number between 1 and 30 ");
   n1 = sss.nextInt();
   System.out.println("Write the number between 1 and 30 ");
   n2= sss.nextInt();
   System.out.println("Write the number between 1 and 30 ");
   n3= sss.nextInt();
   System.out.println("Write the number between 1 and 30 ");
   n4= sss.nextInt();
   System.out.println("Write the number between 1 and 30 ");
   n5= sss.nextInt();

   System.out.print("nr:"+n1);
for(int j=1;j<=n1; j++)
   {
      System.out.print("*");

   }
   System.out.println();
   System.out.print("nr:"+n2);
   for(int j=1;j<=n2; j++)
   {
      System.out.print("*");

   }
   System.out.println();
   System.out.print("nr:"+n3);
   for(int j=1;j<=n3; j++)
   {
      System.out.print("*");

   }
   System.out.println();
   System.out.print("nr:"+n4);
   for(int j=1;j<=n4 ;j++)
   {
      System.out.print("*");

   }
   System.out.println();
   System.out.print("nr:"+n5);
   for(int j=1;j<=n5 ;j++)
   {
      System.out.print("*");

   }
           System.out.println();
}
}