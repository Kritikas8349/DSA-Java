import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println(que);

        Stack<Integer> st = new Stack<>();
        while (!que.isEmpty()) {
            st.push(que.remove());
        }
        while (!st.isEmpty()) {
            que.add(st.pop());
        }

        System.out.println(que);

        // print even indices
        Queue<Integer> ans = new LinkedList<>();

        int index = 0;

        for (int num : que) {
            if (index % 2 == 1) { // odd indices
                ans.add(num);
            }
            index++;
        }

        System.out.println(ans);
    }
}
