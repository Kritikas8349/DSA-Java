class Node {
    int val;
    Node next;
    
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class SLL {
    Node head;
    Node tail;
    int size;


    void insertAtEnd(int val) {

        Node temp = new Node(val);

        // If list is empty
        if (head == null) {
            head = tail = temp;
        }
        // If list already has nodes
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void display() {
 
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Implementation {

    public static void main(String[] args) {

        SLL list = new SLL();
        System.out.println(list.size);

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.display();

        System.out.println(list.size);

        list.insertAtEnd(24);

        list.display();
        System.out.println(list.size);

    }
}