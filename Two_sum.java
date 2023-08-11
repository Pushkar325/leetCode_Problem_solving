import java.util.*;

public class Two_sum
{
    public static int[] twosum(int []arr, int target)
    {
        int []newArr=new int[2];
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i]+arr[i+1]==target)
            {
                newArr[0]=i;
                newArr[1]=i+1;
                break;
            }
            // for(int j=i+1; j<arr.length; j++)
            // {
            //     if(arr[i]+arr[j]==target)
            //     {
            //         newArr[0]=i;
            //         newArr[1]=j;
            //     }
            // }
        }
        return newArr;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0; i<n ;i++)
        {
            arr[i]=sc.nextInt();
        }

        int target=sc.nextInt();

        System.out.println(Arrays.toString(twosum(arr, target)));
        
    }
}