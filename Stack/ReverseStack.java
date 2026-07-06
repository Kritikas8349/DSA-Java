import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println(st);

        Stack<Integer> st_reversed = new Stack<>();
        while (!st.isEmpty()) {
            int element = st.pop();
            st_reversed.push(element);
        }

        System.out.println(st_reversed);
    }
}
