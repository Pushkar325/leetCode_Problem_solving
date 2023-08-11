import java.util.*;

public class sprialMatrix 
{
    public static List<Integer> spiralMatrix(int [][]arr)
    {
        // System.out.println("your spiral matrix is ");
        int row=arr.length;
        int col=arr[0].length;

        List<Integer>result=new ArrayList<>();

        int left=0;
        int right =col-1;
        int  top=0;
        int buttom=row-1;
        while(top<=buttom && left<=right)
        {
            for(int i=left; i<=right; i++)
            {
                result.add(arr[top][i]);
            }
            top++;

            for(int i=top; i<=buttom; i++)
            {
                result.add(arr[i][right]);
            }
            right--;
            if(top<=buttom)
            {
                for(int i=right; i>=left; i--)
                {
                    result.add(arr[buttom][i]);
                }
                buttom--;
                if(left<=right)
                {
                    for(int i=buttom; i>=top; i--)
                    {
                       result.add(arr[i][left]);
                    }
                    left++;
                }
            }

            // for(int i=0; i<result.size(); i++)
            // {
            //     System.out.print(result.get(i)+" ");
            // }
        

        }
        return result;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row..");
        int row=sc.nextInt();
        System.out.println("Enter the number of coloumb..");
        int col=sc.nextInt();
         System.out.println("Enter the elements in the matrix....");
        int [][]arr=new int[row][col];

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(spiralMatrix(arr));

        
    }
    
}
