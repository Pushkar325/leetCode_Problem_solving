import java.util.*;

public class primeNumebr 
{
    static boolean is_prime_number(int n)
    {
        for(int i=2; i*i<=n; i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<=n; i++)
        {
            if(is_prime_number(i))
            {
                System.out.print(i+" ");
            }
        }


    }
    
}









