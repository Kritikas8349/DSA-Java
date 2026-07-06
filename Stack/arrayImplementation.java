public class arrayImplementation {

    public static class MyStack {
        private int[] arr = new int[5];
        private int idx = 0;

        // Check if stack is full
        boolean isFull() {
            return idx == arr.length;
        }

        // Check if stack is empty
        boolean isEmpty() {
            return idx == 0;
        }

        // Push an element
        void push(int x) {
            if (isFull()) {
                System.out.println("Stack is Full.");
                return;
            }
            arr[idx++] = x;
        }

        // Pop an element
        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty.");
                return -1;
            }
            return arr[--idx];
        }

        // Peek the top element
        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty.");
                return -1;
            }
            return arr[idx - 1];
        }

        // Display stack
        void display() {
            if (isEmpty()) {
                System.out.println("Stack is Empty.");
                return;
            }

            System.out.print("Stack: ");
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // Size of stack
        int size() {
            return idx;
        }
    }

    public static void main(String[] args) {

        MyStack st = new MyStack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        st.display();

        System.out.println("Top Element: " + st.peek());

        System.out.println("Popped: " + st.pop());

        st.display();

        System.out.println("Size: " + st.size());

        st.push(50);
        st.push(60);

        st.display();

        // Trying to push when full
        st.push(70);
    }
}