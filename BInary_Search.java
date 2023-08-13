import java.util.*;



public class BInary_Search 
{
    public static int binarySearch(int []arr, int elements)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            // int mid=(start+end)/2;
            int mid=(start+(end-start)/2);
            if(arr[mid]==elements)
            {
                return mid; 
            }
            else if(arr[mid]<elements)
            {
               start=mid+1;
            }
            else 
            {
               end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int elements =sc.nextInt();
        System.out.println(binarySearch(arr, elements));
    }
    
}
