import java.util.*;

public class Sliding_Window_Maximum 
{
    public static int[] Sliding_window_maximum(int []arr, int slide_K)
    {
         ArrayList<Integer>ans=new ArrayList<>();
        int j, max , move=0;
        for(int i=0; i<=arr.length-slide_K; i++)
        {
            max=arr[i];
             for(j=1; j<slide_K; j++)
             {
                if(arr[i+j]>max)
                {
                    max=arr[i+j];
                }
             }
             move++;
            
             ans.add(max);
            //  System.out.print(max+" ");

        }
        int newArr[]=new int[move];
        for(int i=0; i<ans.size(); i++)
        {
            newArr[i]=ans.get(i);
        }

        return newArr;
        
        // System.out.println(Arrays.toString(newArr));


    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arrays .....");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        int slide_K=sc.nextInt();
       System.out.println(Arrays.toString(Sliding_window_maximum(arr,slide_K)));

        
    }
    
}
