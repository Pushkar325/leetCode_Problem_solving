import java.util.*;

public class LInkedHash_Set 
{
    public static void main(String[] args) 
    {
        LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(1);
        lhs.add(2);
        lhs.add(5);
        for(Integer it:lhs)
        {
            System.out.println(it);
        }
        System.out.println(lhs);
        
    }
    
}
