
import java.util.PriorityQueue;

public class BasicHeap {
    public static void main(String[] args) {
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       pq.add(10);
       pq.add(20);
       pq.add(30);
       pq.remove();
       System.out.println(pq);
       pq.add(40);
       System.out.println(pq);
       pq.add(-34);
       System.out.println(pq);
       pq.add(0);
       System.out.println(pq);
       pq.add(1);
       System.out.println(pq);
       pq.add(2);
       System.out.println(pq);
       pq.add(3);
       System.out.println(pq);
    }    
}
