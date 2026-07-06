class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class MergeTwoSortedList {

    public static ListNode mergeList(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            }

            else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

            if (list1 != null) {
                temp.next = list1;
            }

            if (list2 != null) {
                temp.next = list2;
            }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(5);

        printList(list1);
        printList(list2);

        ListNode merged = mergeList(list1, list2);

        printList(merged);
    }
}
