import java.util.ArrayList;

public class INTRO {
    public static void main(String args[]) {
        // className objectName=new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        // Add element in array- TC=O(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        list.add(1, 50); // Different way with - TC =O(n)
        System.out.println(list);
        // Get Operation - TC=O(1)
        int e = list.get(2);
        System.out.println(e);

        // remove element - TC=O(n)
        int r = list.remove(3);
        System.out.println(list);
        // set element
        list.set(1, 10);
        System.out.println(list);
        // contains elements= Tc=O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(15));
        // Size
        int l=list.size();
        System.out.println(l);

    }
}
