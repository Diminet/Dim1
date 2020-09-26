public class L14
{
    public static void main(String[] args)
    {
        int[] numbers = { 1, 2, 3, 4, 4, 2, 1 };
        System.out.println("9+9= " + suma(9, 9));
        System.out.println("1+2+3= " + suma(1, 2, 3));
        System.out.println("Suma totala:" + suma(numbers));
    }
    public static int suma(int... ar)
    {
        int exec = 0;
        for (int i = 0; i < ar.length; i++)
        {
            exec += ar[i];
        }

        return exec;
    }
}