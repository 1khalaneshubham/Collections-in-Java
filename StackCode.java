import java.util.*;

public class StackCode {
    public static void main(String args[]){
        Stack<String>animals = new Stack<>();
        animals.push("Cat1");
        animals.push("Cat2");
        animals.push("Cat3");
        animals.push("Cat4");
        animals.push("Cat5");

        System.out.println("Stack"+animals);
        System.out.println("Last Element:"+animals.peek());
        animals.pop(); // cat5
        animals.pop(); // cat4
        System.out.println("Last Element:"+animals.peek());
        System.out.println("Stack"+animals);
    }
}