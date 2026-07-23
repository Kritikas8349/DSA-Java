public class CircularQueue {

    public static class Cque {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];

        // Enqueue
        public void add(int val) {

            if (size == arr.length) {
                System.out.println("Queue is full.");
                return;
            }

            if (size == 0) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % arr.length;
            }

            arr[rear] = val;
            size++;
        }

        // Dequeue
        public int remove() {

            if (size == 0) {
                System.out.println("Queue is empty.");
                return -1;
            }

            int val = arr[front];

            if (size == 1) {
                front = rear = -1;
            } else {
                front = (front + 1) % arr.length;
            }

            size--;
            return val;
        }

        // Peek
        public int peek() {

            if (size == 0) {
                System.out.println("Queue is empty.");
                return -1;
            }

            return arr[front];
        }

        // Display
        public void display() {

            if (size == 0) {
                System.out.println("Queue is empty.");
                return;
            }

            int i = front;

            while (true) {
                System.out.print(arr[i] + " ");

                if (i == rear)
                    break;

                i = (i + 1) % arr.length;
            }

            System.out.println();
        }

        // Check if queue is empty
        public boolean isEmpty() {
            return size == 0;
        }

        // Current size
        public int size() {
            return size;
        }
    }

    public static void main(String[] args) {

        Cque q = new Cque();

        q.display();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.display();

        System.out.println("Removed : " + q.remove());

        q.display();

        q.add(6);

        q.display();

        System.out.println("Front : " + q.peek());

        q.remove();
        q.remove();

        q.display();

        q.add(7);
        q.add(8);

        q.display();

        while (!q.isEmpty()) {
            System.out.println("Removed : " + q.remove());
        }

        q.display();
    }
}