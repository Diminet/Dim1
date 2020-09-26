public class Lab14
{
    public static void main(String[] args)
    {
        int[] numbers = { 1, 2, 3, 4, 4, 2, 1 };
        System.out.println("9*9= " + suma(9, 9));
        System.out.println("1*2*3= " + suma(1, 2, 3));
        System.out.println("Product  of series:" + suma(numbers));
    }
    public static int suma(int... ar)
    {

        for (int i = 1; i < ar.length; i++)
        {
            ar[0] *= ar[i];
        }

        return ar[0];
    }
}
