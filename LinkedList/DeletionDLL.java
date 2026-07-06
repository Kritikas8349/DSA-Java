public class DeletionDLL {
    // Print from Head
    public static void print(dNode head) {
        dNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Print from Tail
    public static void reverse(dNode tail) {
        dNode temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Delete Head
    public static dNode deleteHead(dNode head) {

        if (head == null)
            return null;

        if (head.next == null)
            return null;

        head = head.next;
        head.prev = null;

        return head;
    }

    // Delete Tail
    public static dNode deleteTail(dNode head) {

        if (head == null)
            return null;

        if (head.next == null)
            return null;

        dNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;

        return head;
    }

    // Delete at Any Index
    public static dNode deleteAtIndex(dNode head, int idx) {

        if (head == null)
            return null;

        if (idx == 0)
            return deleteHead(head);

        dNode temp = head;

        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }

        // If deleting the last node
        if (temp.next == null) {
            temp.prev.next = null;
            return head;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        return head;
    }

    public static void main(String[] args) {

        dNode a = new dNode(10);
        dNode b = new dNode(20);
        dNode c = new dNode(30);
        dNode d = new dNode(40);
        dNode e = new dNode(50);

        // Creating Doubly Linked List
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        b.prev = a;
        c.prev = b;
        d.prev = c;
        e.prev = d;

        dNode head = a;

        System.out.println("Original List:");
        print(head);

        // Delete Head
        head = deleteHead(head);
        System.out.println("After Deleting Head:");
        print(head);

        // Delete Tail
        head = deleteTail(head);
        System.out.println("After Deleting Tail:");
        print(head);

        // Delete at Index 1
        head = deleteAtIndex(head, 1);
        System.out.println("After Deleting Index 1:");
        print(head);

        // Find Tail for Reverse Traversal
        dNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        System.out.println("Reverse Traversal:");
        reverse(tail);
    }
}
