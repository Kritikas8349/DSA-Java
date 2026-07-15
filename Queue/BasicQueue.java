import java.util.LinkedList;
import java.util.Queue;

public class BasicQueue {
    public static void main(String[] args) {
          Queue<Integer> que = new LinkedList<>();

          que.add(1);
          que.add(2);
          que.add(3);
          que.add(4);
          que.add(5);

          System.out.println(que);
          que.remove();
          System.out.println(que);
          que.poll(); //remove element
          System.out.println(que);
          System.out.println(que.peek());
          System.out.println("Size of the queue is: "+que.size());
          System.out.println(que.isEmpty());
          
    }
}
