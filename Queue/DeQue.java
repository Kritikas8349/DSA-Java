public class DeQue {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static class Deque {
        Node front;
        Node rear;
        int size;

        Deque() {
            front = rear = null;
            size = 0;
        }

        boolean isEmpty() {
            return size == 0;
        }

        // Insert at Front
        void insertFront(int data) {
            Node newNode = new Node(data);

            if (front == null) {
                front = rear = newNode;
            } else {
                newNode.next = front;
                front.prev = newNode;
                front = newNode;
            }

            size++;
        }

        // Insert at Rear
        void insertRear(int data) {
            Node newNode = new Node(data);

            if (rear == null) {
                front = rear = newNode;
            } else {
                newNode.prev = rear;
                rear.next = newNode;
                rear = newNode;
            }

            size++;
        }

        // Delete from Front
        void deleteFront() {

            if (isEmpty()) {
                System.out.println("Deque is Empty");
                return;
            }

            if (front == rear) {
                front = rear = null;
            } else {
                front = front.next;
                front.prev = null;
            }

            size--;
        }

        // Delete from Rear
        void deleteRear() {

            if (isEmpty()) {
                System.out.println("Deque is Empty");
                return;
            }

            if (front == rear) {
                front = rear = null;
            } else {
                rear = rear.prev;
                rear.next = null;
            }

            size--;
        }

        //getFront

        int getFront(){
            if(size == 0){
                System.out.println("overflow");
                return -1;
            }
            return front.data;
        }

        //getRear

        int getRear(){
            if(size == 0){
                System.out.println("underflow");
                return -1;
            }
            return rear.data;
        }

        // Display
        void display() {

            if (isEmpty()) {
                System.out.println("Deque is Empty");
                return;
            }

            Node temp = front;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Deque dq = new Deque();

        dq.insertFront(20);
        dq.insertFront(10);
        dq.insertRear(30);
        dq.insertRear(40);

        dq.display();     // 10 20 30 40

        dq.deleteFront();
        dq.display();     // 20 30 40
        System.out.println(dq.getFront());
        dq.deleteRear();
        System.out.println(dq.getRear());
        dq.display();     // 20 30
    }
} 