public class linkedListImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static class MyStack{
        Node head = null;
        int size = 0;
        
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int size(){
            return size;
        }

        int pop(){
            if(head == null){
                System.out.println("Stack is Empty.");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        int peek(){
            if(head == null){
                System.out.println("Stack is Empty.");
                return -1;
            }
            return head.val;
        }
        
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        boolean isEmpty(){
            return head == null;
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
