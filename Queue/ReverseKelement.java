import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKelement {

    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {

        if (q == null || k <= 0 || k > q.size()) {
            return q;
        }

        Stack<Integer> st = new Stack<>();

        int remaining = q.size() - k;

        // Remove first k elements and push into stack
        for (int i = 0; i < k; i++) {
            st.push(q.poll());
        }

        // Pop from stack and add back to queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }     //40 50 30 20 10

        // Move remaining elements to the back
        for (int i = 0; i < remaining; i++) {
            q.add(q.poll());
            //50 30 20 10 40
            //30 20 10 40 50
        }

            //30 20 10 40 50
        return q;
    }

    public static void main(String[] args) {

        ReverseKelement rev = new ReverseKelement();

        Queue<Integer> que = new LinkedList<>();

        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);

        Queue<Integer> newq = rev.modifyQueue(que, 3);

        System.out.println(newq);
    }
}

//time complexity : O(n)