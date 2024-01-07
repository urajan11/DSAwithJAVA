import java.util.*;
public class UnionAndIntersection 
{
    public static void main(String [] args)
    {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<arr1.length;i++)
        {
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            hs.add(arr2[i]);
        }

        System.out.println("Union = "+hs.size());
        System.out.println("Union Elements = "+hs);

        int count = 0;
        hs.clear();
        for(int i=0;i<arr1.length;i++)
        {
            hs.add(arr1[i]);
        }       
        for(int i=0;i<arr2.length;i++)
        {
            if(hs.contains(arr2[i]))
            {
                count++;
                hs.remove(arr2[i]);
                System.out.println("Intersection element = "+arr2[i]);
            }
        }
        System.out.println("No. of Intersection elements = "+count);
        
    }
}
