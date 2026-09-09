class Minheap {

    int[] arr;
    int size;

    Minheap(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    // Add element
    public void add(int num) {

        arr[size] = num;
        size++;

        upheapify(size - 1);
    }

    // Move element upward
    public void upheapify(int idx) {

        // Root
        if (idx == 0) {
            return;
        }

        int p = (idx - 1) / 2;

        if (arr[idx] < arr[p]) {

            swap(idx, p);

            upheapify(p);
        }
    }

    // Swap two elements
    public void swap(int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Return size
    public int size() {
        return size;
    }

    // Remove minimum element
    public int remove() throws Exception {

        if (size == 0) {
            throw new Exception("Heap is Empty.");
        }

        // Minimum element is at root
        int peek = arr[0];

        // Move last element to root
        swap(0, size - 1);

        // Decrease size
        size--;

        // Restore heap property
        downheapify(0);

        return peek;
    }

    // Move element downward
    public void downheapify(int idx) {

        int left = 2 * idx + 1;
        int right = 2 * idx + 2;

        int min = idx;

        // Check left child
        if (left < size && arr[left] < arr[min]) {
            min = left;
        }

        // Check right child
        if (right < size && arr[right] < arr[min]) {
            min = right;
        }

        // If child is smaller than current element
        if (min != idx) {

            swap(idx, min);

            downheapify(min);
        }
    }
}


public class MinHeapArray {

    public static void main(String[] args) throws Exception {

        Minheap pq = new Minheap(10);

        pq.add(1);
        pq.add(6);
        pq.add(2);

        System.out.println(pq.size());

        pq.add(0);

        System.out.println(pq.size());

        System.out.println("Removed: " + pq.remove());
       

        System.out.println("Size: " + pq.size());
    }
}