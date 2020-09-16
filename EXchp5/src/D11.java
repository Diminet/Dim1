import java.util.Scanner;

public class D11 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        int num = Input("Enter number :", ss);
        int val = Input("Enter value: ", ss);
        --num;
        while (num > 0) {
            int c_val = Input("Enter value: ", ss);
           val = Math.min(c_val, val);
            --num;
        }
        System.out.printf("Minim:="+val);
    }
    public static int Input(String s,Scanner ss) {
        System.out.print(s);
        return ss.nextInt();
    }

}