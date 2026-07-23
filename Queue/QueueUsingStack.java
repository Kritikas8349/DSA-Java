import java.util.Stack;

public class QueueUsingStack {

    static class MyQueue {
        Stack<Integer> st1;
        Stack<Integer> st2;

        public MyQueue() {
            st1 = new Stack<>();
            st2 = new Stack<>();
        }

        public void push(int x) {
            st1.push(x);
        }

        private void move() {
            if (st2.isEmpty()) {
                while (!st1.isEmpty()) {
                    st2.push(st1.pop());
                }
            }
        }

        public int pop() {
            move();
            return st2.pop();
        }

        public int peek() {
            move();
            return st2.peek();
        }

        public boolean isEmpty() {
            return st1.isEmpty() && st2.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        // Example
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.isEmpty());
    }
}