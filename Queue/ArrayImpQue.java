public class ArrayImpQue {

    public static class que {
        int f = -1, r = -1;
        int size = 0;
        int[] arr = new int[5];

        // Add
        public void add(int val) {
            if (r == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }

            if (f == -1 && r == -1) {
                f = r = 0;
            } else {
                r++;
            }

            arr[r] = val;
            size++;
        }

        // Remove
        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            int val = arr[f];
            f++;
            size--;

            if (size == 0) {
                f = r = -1;
            }

            return val;
        }

        // Peek
        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[f];
        }

        // Is Empty
        public boolean isEmpty() {
            return size == 0;
        }

        // Display
        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }

            for (int i = f; i <= r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        que q = new que();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        q.display();

        System.out.println("Removed : " + q.remove());

        q.display();

        System.out.println("Front : " + q.peek());

        System.out.println("Is Empty : " + q.isEmpty());
    }
}