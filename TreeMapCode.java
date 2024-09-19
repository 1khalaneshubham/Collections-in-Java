import java.util.*;

public class TreeMapCode {
    public static void main(String[] args) {
        
        Map<String,Integer> Num = new TreeMap<>();
        
        Num.put("Stu1",1);
        Num.put("Stu2",2);
        Num.put("Stu3",3);
        Num.put("Stu4",4);
        Num.put("Stu5",5);

        System.out.println("Num Data:"+Num);
        
        Num.remove("Stu4");

        System.out.println("New Num Data:"+Num);
    }

}
