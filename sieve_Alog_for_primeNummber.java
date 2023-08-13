


//     import java.util.*;
// public class sieve_Alog_for_primeNummber 
// {

// 	public static ArrayList<Integer> primeNumbersTillN(int N) 
// 	{ 
// 	 	// Write your code here
// 		 ArrayList<Integer>result = new ArrayList<>();
// 		 int[] primes = new int[N+1];

//           //0 -> not crossed out -> primes
//           //1 -> crosssed out -> not-prime

// 		 for(int i=0; i<N; i++)
// 		 {
// 			 primes[i]=0;
// 		 }
// 		 primes[1]=1; // for index one we set 1 because 1 is not prime 

// 		 for(int i=2; i*i<=N; i++)
// 		 {
// 			 if(primes[i]== 0)
// 			 {
//                 for(int j=i*i;j<=N;j+=i)
// 				{
//                   primes[j] = 1;
//                 }
//             }
// 		 }
// 		for(int i=1;i<=N;i++)
//         {
//           if(primes[i] == 0)
// 		  {
// 			  result.add(i);
// 		  }
//         }
// 		 return result;
// 	}
//     public static void main(String args[])
//     {
//          Scanner sc=new Scanner(System.in);
//          int n=sc.nextInt();

//          System.out.println(primeNumbersTillN(n));;
//     }
// }

    


       // or we can make like that 


       import java.util.*;

       public class sieve_Alog_for_primeNummber
       {
        public static void printPrimeNumberUsing_sieve_Alog(int n)
        {
            // step 1 ... create booelan array of size n+1
            boolean []isPrime=new boolean[n+1];
            
            // step 2....  mark true 
            Arrays.fill(isPrime,true);

            // step 3.... loop run karo 2 to root n tak
            for(int i=2; i*i<=isPrime.length; i++)
            {
                if(isPrime[i]==true)
                {
                    // then making multiple is not prime
                    for(int j=i+i; j<isPrime.length; j=j+i)
                    {
                        isPrime[j]=false;
                    }
                }

            } 
              // print all prime number till N
              System.out.println("Your prime number for 1 to " + n +" is.... ");
              for(int i=2; i<isPrime.length; i++)
              {
                if(isPrime[i]==true)
                {
                    System.out.print(i+" ");
                }
              }
              System.out.println();
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number ....");
            int n=sc.nextInt();
            sc.close();
            printPrimeNumberUsing_sieve_Alog(n);
        }
       }

       // time coplexity of the sieve algorithm is 0(n)