import java.util.*;
public class TreeSetCode {
    public static void main(String args[]){
        
        Set<Integer>set = new TreeSet<>();
        Set<String> set1 = new TreeSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        set1.add("ZShubham");
        set1.add("bMayur");
        set1.add("cJack");
        set1.add("dPK");
        
        System.out.println("All Data:"+set);
        System.out.println("All Data:"+set1);
        
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

