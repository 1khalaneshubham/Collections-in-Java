import java.util.*;

public class HashMapCode {
    public static void main(String args[]){

        Map<String,Integer> numbers = new HashMap<>();

        numbers.put("Stu1", 1);
        numbers.put("Stu2", 2);
        numbers.put("Stu3", 3);
        numbers.put("Stu4", 4);
        numbers.put("Stu5", 5);

        System.out.println("New Numbers:"+numbers);

        for(Map.Entry<String,Integer>e:numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey()+" "+e.getValue());
        }

        Map<Integer,String> Data = new HashMap<>();

        Data.put(11 ," A");
        Data.put(22 ," B");
        Data.put(33 ," C");
        Data.put(44 ," D");
        Data.put(55 ," E");

        System.out.println("New Data:"+Data);

        for(Map.Entry<Integer,String>e:Data.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey()+" "+e.getValue());
        }

        System.out.println(numbers.containsKey("Stu1"));
        System.out.println(numbers.containsValue(10));

        System.out.println(Data.isEmpty());

    }    
}
