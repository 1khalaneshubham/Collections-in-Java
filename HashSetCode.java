import java.util.*;

public class HashSetCode {
    public static void main(String[] args) {
        
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println(set);
        // System.out.println(set);

        set.remove(30);
        System.out.println(set);

        System.out.println(set.contains(30));
        System.out.println(set.contains(20));

        System.out.println(set.isEmpty());

        System.out.println("Data:"+set.size());
        
        set.clear();

        System.out.println("Data:"+set);
        System.out.println("Set Size:"+set.size());
    }    
}
