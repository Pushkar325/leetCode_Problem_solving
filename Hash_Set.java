import java.util.*;


public class Hash_Set 
{
    public static void callHashsetfun(int []arr)
    {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0; i<arr.length; i++)
        {
            hs.add(arr[i]);
        }
        Iterator<Integer>itr=hs.iterator();
        while(itr.hasNext())
        {
            System.err.println(itr.next());
        }
         
        System.out.println("Print using for each loop ");
        for(Integer it:hs)
        {
            System.out.println(it);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        callHashsetfun(arr);
    }
    
}
