import java.util.*;

public class LinkedListcode {
    public static void main(String ags[]){
        
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println("All data of Data:"+queue);
        
        queue.poll();               // 10
        System.out.println("After lossing one element of data: "+queue);   

        // queue.peek();               // 20
        System.out.println("Last Element: "+queue.peek());
    }    
}
