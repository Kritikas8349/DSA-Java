import java.util.HashSet;

public class BasicHashset{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //Insert TC: O(1)
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);

        System.out.println(set);   // O(n)
        System.out.println(set.size());
        System.out.println(set.contains(100));  //search  -> return true or false
        System.out.println(set.contains(50));  
        set.remove(200);
        System.out.println(set);
        Object[] arr = set.toArray();

        for (Object arr1 : arr) {
            System.out.println(arr1);
        }
    }
}