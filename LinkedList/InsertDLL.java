public class InsertDLL {

    // Print from head
    public static void print(dNode head) {
        dNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Print from tail
    public static void reverse(dNode tail) {
        dNode temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Insert at Head
    public static dNode insertAtHead(dNode head, int val) {
        dNode newNode = new dNode(val);

        if (head == null)
            return newNode;

        newNode.next = head;
        head.prev = newNode;

        return newNode;
    }

    // Insert at Tail
    public static dNode insertAtTail(dNode head, int val) {
        dNode newNode = new dNode(val);

        if (head == null)
            return newNode;

        dNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    // Insert at Any Index
    public static dNode insertAtIndex(dNode head, int idx, int val) {

        if (idx == 0)
            return insertAtHead(head, val);

        dNode temp = head;

        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        dNode newNode = new dNode(val);

        // Insert at the end
        if (temp.next == null) {
            temp.next = newNode;
            newNode.prev = temp;
            return head;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        temp.next.prev = newNode;
        temp.next = newNode;

        return head;
    }

    public static void main(String[] args) {

        dNode a = new dNode(10);
        dNode b = new dNode(20);
        dNode c = new dNode(30);
        dNode d = new dNode(40);

        // Creating Doubly Linked List
        a.next = b;
        b.next = c;
        c.next = d;

        b.prev = a;
        c.prev = b;
        d.prev = c;

        dNode head = a;

        System.out.println("Original List:");
        print(head);

        // Insert at Head
        head = insertAtHead(head, 5);
        System.out.println("After Insert at Head:");
        print(head);

        // Insert at Tail
        head = insertAtTail(head, 50);
        System.out.println("After Insert at Tail:");
        print(head);

        // Insert at Index
        head = insertAtIndex(head, 3, 25);
        System.out.println("After Insert at Index 3:");
        print(head);

        // Find Tail for Reverse Printing
        dNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        System.out.println("Reverse Traversal:");
        reverse(tail);
    }
}