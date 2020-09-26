import java.util.*;
public class L12
{

    public static void main(String[] args) {
        int i=0;
        int arr[]=new int[100];
        Scanner sss=new Scanner(System.in);
        do{
            System.out.println((i+1)+" Enter value 5 between 10 and 100:=");
            int n=sss.nextInt();
            if(n < 10 || n > 100)
                continue;
            if(dup(arr, n)==false)
            {
                arr[i]=n;
                i++;
            }
            else if(dup(arr,n)==true)
            {
                System.out.println("\n Enter Unique value\n");
            }
        }while(i<5);
        System.out.println("\nAR:\n");
        System.out.print(arr[0] + " ");
        int uniq = 0;
        for( i=1; i<arr.length; i++){
            if(arr[i] > 0){

                for(int j=i-1; j>=0; j--){
                    if(arr[i] == arr[j]){
                        uniq = 0;
                        break;
                    }else{
                        uniq = arr[i];
                    }
                }
                if(uniq > 0)
                    System.out.print(uniq + " ");
            }else{
                continue;
            }
        }
        System.out.println();
    }
    private static boolean dup(int arr[], int n)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]==n)
            {
                return true;
            }
        }
        return false;
    }

}
