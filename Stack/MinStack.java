import java.util.Stack;

public class MinStack {

    int[] arr = {18, 19, 29, 15, 16};

    Stack<Integer> st = new Stack<>();
    Stack<Integer> sst = new Stack<>();

    // Push
    void push(int a) {

        st.push(a);

        if (sst.isEmpty() || a <= sst.peek()) {
            sst.push(a);
        }
    }

    // Pop
    int pop() {

        if (st.isEmpty()) {
            return -1;
        }

        int ans = st.pop();

        if (ans == sst.peek()) {
            sst.pop();
        }

        return ans;
    }

    // Top
    int top() {
 
        if (st.isEmpty()) {
            return -1;
        }

        return st.peek();
    }

    // Get Minimum
    int getMin() {

        if (sst.isEmpty()) {
            return -1;
        }

        return sst.peek();
    }

    public static void main(String[] args) {

        MinStack ms = new MinStack();

        // Push all elements of array into stack
        for (int x : ms.arr) {
            ms.push(x);
        }

        System.out.println("Top : " + ms.top());
        System.out.println("Minimum : " + ms.getMin());

        System.out.println("Popped : " + ms.pop());
        System.out.println("Minimum : " + ms.getMin());

        System.out.println("Popped : " + ms.pop());
        System.out.println("Minimum : " + ms.getMin());

        System.out.println("Top : " + ms.top());
    }
}