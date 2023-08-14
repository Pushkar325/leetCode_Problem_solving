import java.util.*;

public class vector 
{
    public static void sortedOrder(int []vect)
    {
        Vector<Integer>v=new Vector<>();
        for(int i=0; i<vect.length; i++)
        {
            v.add(vect[i]);
        }
        System.out.println("\nAdding value in the vector with the help simple for loop : ");
        for(int i=0; i<v.size(); i++)
        {
            System.out.println(v.get(i));
        }
        
        System.out.println("\nPrint vector through the enhanced loop ...");
        for(Integer x: v)
        {
            System.out.println(x);
        }

        System.out.println("\nprint vector through Iterator ....");
        Iterator<Integer> itr=v.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

         System.out.println("\nPrint through the Enumeration .....");
        Enumeration<Integer> e = v.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arrays ");
        int n=sc.nextInt();
        System.out.println("Enter the elemetns in the arrays ");
        int []vec=new int[n];
        for(int i=0; i<n; i++)
        {
            vec[i]=sc.nextInt();
        }

        sortedOrder(vec);
    }
    
}
