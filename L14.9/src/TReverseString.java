import java.util.Scanner;
import java.util.*;
class TReverseString{

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print(" Prep:");
        String s=input.nextLine();
        String[] tmp=s.split(" ");

        String reve="";
        for (int i=tmp.length-1;i>=0;i--)
            reve+=tmp[i]+" ";
        System.out.printf("conv prep:");
        System.out.println(reve.substring(0, 1).toUpperCase()
                + reve.substring(1));
    } }