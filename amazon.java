import java.util.*;


public class amazon 
{
    public static long getDiscountPiar(int []arr, int x)
    {
        long count=0;
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if((arr[i]+arr[j])%x==0)
                {
                    count++;

                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
       System.out.println( getDiscountPiar(arr,x));
    //    System.out.println(l);
    }
    
}
