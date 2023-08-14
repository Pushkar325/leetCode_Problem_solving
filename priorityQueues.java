import java.util.*;

public class priorityQueues 
{
    public static void sortedOrderInReverse(int []arr)
    {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        
        for(int i=0; i<arr.length; i++)
        {
             pq.add(arr[i]);
        }
        

        System.out.println("Your soreted array in reverese order with the help of priority Queues....");
        while(!pq.isEmpty())
        {
            System.out.println(pq.poll());
        }

    }
    public static void sortedOrder(int []arr)
    {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        
        for(int i=0; i<arr.length; i++)
        {
             pq.add(arr[i]);
        }

        System.out.println("Your soreted array with the help of priority Queues....");
        Iterator iterator = pq.iterator();
 
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
          
               // OR

        // while(!pq.isEmpty())
        // {
        //     System.out.println(pq.poll());
        // }


        // check for the contain or not 
        System.out.println("\n\ncheck number contain : "+pq.contains(50));


        // chech the size of pq 
        System.out.println("\n\n This is the size of the priority Queues : "+pq.size());



        // check the pq is empty or not
        System.out.println("This function check pq is empty or not : "+pq.isEmpty());


        // clear is used for removed all the elements from the pq
       // System.out.println("This is the clear function : "+ pq.clear());
    }

    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number....");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();

        sortedOrder(arr);
        sortedOrderInReverse(arr);

        // PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        // pq.add(2);
        // pq.add(4);
        // pq.add(1);
        // pq.add(5);
        // while(!pq.isEmpty())
        // {
        //     System.out.println(pq.peek());
        //     pq.remove();
        // }

    }
    
}


// java mai priority queue always min heap se banta hai by defult.