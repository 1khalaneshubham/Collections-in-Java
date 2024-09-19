import java.util.*;

public class CollectionFunctioOnArrayLIst {
    public static void main(String args[]){
        
        ArrayList<Integer> StudentRoll = new ArrayList<>();
        ArrayList<String> StudentName = new ArrayList<>();
        
        StudentRoll.add(1);
        StudentName.add("Shubham");
        StudentName.add("Shubham");
        StudentName.add("Shubham");
        StudentRoll.add(12);
        StudentName.add("Mayur");
        StudentRoll.add(123);
        StudentName.add("PK");
        StudentRoll.add(1234);
        StudentRoll.add(1234);
        StudentRoll.add(1234);
        StudentName.add("KP");
        StudentRoll.add(12345);
        StudentName.add("Jack");

        System.out.println("Data of Student RollN:"+StudentRoll);
        System.out.println("Data of Student Name:"+StudentName);

        System.out.println("Min Roll:"+Collections.min(StudentRoll));
        System.out.println("Min Name:"+Collections.min(StudentName));

        System.out.println("Max Roll:"+Collections.max(StudentRoll));
        System.out.println("Max Name:"+Collections.max(StudentName));

        System.out.println("frequency Count Of RollN:"+Collections.frequency(StudentRoll,1234));
        System.out.println("frequency Count Of Name:"+Collections.frequency(StudentName,"Shubham"));

        Collections.sort(StudentRoll);
        Collections.sort(StudentName);

        System.out.println("Max Roll:"+StudentRoll);
        System.out.println("Max Name:"+StudentName);

        Collections.sort(StudentRoll,Comparator.reverseOrder());
        Collections.sort(StudentName,Comparator.reverseOrder());
        // Collections.sort(StudentName);

        System.out.println("Max Roll:"+StudentRoll);
        System.out.println("Max Name:"+StudentName);
    }    
}
