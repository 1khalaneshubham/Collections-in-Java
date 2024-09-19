import java.util.*;

public class ArrayListCode{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
        
        list.add(4);
        list.add(5);
        list.add(2,100);
        System.out.println(list); // Update data with as per Seq
        
        List<Integer> Data = new ArrayList<>();
        
        Data.add(9); 
        Data.add(99); 
        Data.add(999); 
        
        list.addAll(1,Data);

        System.out.println(list.contains(9)); 
        System.out.println(list.get(1)); 
        System.out.println(list.remove(1)); 
        
        list.remove(Integer.valueOf(999));
       
        System.out.println(list.contains(9)); 
        
        list.remove(Integer.valueOf(99));
        list.remove(Integer.valueOf(99));
        // list.clear(); 

        for(int i = 0; i < list.size(); i++){
            System.out.println("Get Element is:"+list.get(i));
        }
        
        System.out.println(list); 

    }
}