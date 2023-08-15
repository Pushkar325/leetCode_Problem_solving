import java.util.*;


public class Hash_map 
{
    public static void main(String[] args) 
    {
        

        HashMap<Integer,String>hmap= new HashMap<>();
        hmap.put(1, "DevShree");
        hmap.put(2,"Pushkar");
        hmap.put(3,"Jitenrea narayan singh");
        hmap.put(4,"Sangeeta devi");


                           // style 1 
         System.out.println("This is the simple style to print : "+ hmap);


                           //style 2
                           System.out.println("\n\nusing  for loop ");
       System.out.println("R.No |   Name");
        for(Map.Entry<Integer,String> set:hmap.entrySet())
        {
            System.out.println(" "+ set.getKey()+"     "+ set.getValue());
        }

              
                          //style 3 
                          System.out.println("\n\nusing for each loop ");
        hmap.entrySet().forEach(entry->{
            System.out.println(entry.getKey()+" "+entry.getValue());
        });
        
    }
    
}
