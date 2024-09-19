import java.util.*;

public class ArrayDequeCode {
    public static void main(String args[]){
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(20);
        adq.offer(30);
        adq.offerFirst(10);
        adq.offerLast(40);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println(adq);

        System.out.println(adq.pollFirst());
        System.out.println(adq);

        System.out.println(adq.pollLast());
        System.out.println(adq);
    }    
}
