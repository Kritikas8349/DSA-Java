class Node {
    int val;
    Node next;
    public Node right;
    public Node left;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class queueLL {
    Node head = null;
    Node tail = null;
    int size = 0;

    public void add(int x) {
        Node temp = new Node(x);
        if (size == 0) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return head.val;
    }

    public int remove() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return -1;
        }
        int x = head.val;
        head = head.next;
        size--;
        return x;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + ",");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedListImpQue {
    public static void main(String[] args) {
        queueLL que = new queueLL();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);

        que.display();
        System.out.println(que.remove());
        System.out.println(que.peek());
        System.out.println(que.isEmpty());

    }
}
