import java.util.*;

public class Dynamic_Programming_fibb_no 
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number....");
        int n=sc.nextInt();
    
        int []dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;

       for(int i=2; i<=n; i++)
       {
           dp[i]=dp[i-1]+dp[i-2];
        }
       System.out.println("This is your dp fibbonacci number of " + n + " is ....");
       System.out.println(dp[n]);
    
    }

}

// time complexity of 0(n)