import java.util.*;

public class priorityQueueCode {
    public static void main(String args[]){

        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(11);
        pq.offer(22);
        pq.offer(33);
        pq.offer(44);
        pq.offer(55);

        System.out.println("All Data:"+pq);

        pq.poll();  

        System.out.println("After Updating Data:"+pq);

        System.out.println("Current removing Data:"+pq.peek());
    }    
}
