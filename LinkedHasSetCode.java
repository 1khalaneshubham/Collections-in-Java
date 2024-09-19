import java.util.*;

public class LinkedHasSetCode {
    public static void main(String args[]){

        Set<Integer>set = new LinkedHashSet<>();
        
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println("All Data:"+set);

        set.remove(3);
        System.out.println("After Removing:"+set);

        set.contains(3);
        set.contains(4);

        System.out.println("Contains:"+set);

        System.out.println("Y/N:"+set.isEmpty());

        System.out.println("All Size:"+set.size());

        set.clear();

        System.out.println("All Clear:"+set);
    }    
}
