import java.util.*;

public class waveMatrix 
{
    // public static void waveMatrix(int arr[][])
    // {
    //     for(int j=0; j<arr[0].length; j++)
    //     {
    //         if(j%2==0)
    //         {
    //             for(int i=0; i<arr.length; i++)
    //             {
    //                 System.err.println(arr[i][j]);
    //             }
    //         }
    //         else
    //         {
    //             for(int i=arr.length-1; i>0 ; i--)
    //             {
    //                 System.out.println(arr[i][j]);
    //             }

    //         }
    //     }
        

    // }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][]arr=new int[row][col];
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        //   waveMatrix(arr);

        for(int j=0; j<arr[0].length; j++)
        {
            if(j%2==0)
            {
                for(int i=0; i<arr.length; i++)
                {
                    System.err.print(arr[i][j]+" ");
                }
            }
            else
            {
                for(int i=arr.length-1; i>=0 ; i--)
                {
                    System.out.print(arr[i][j]+" ");
                }

            }
        }
        

    }
    
}
