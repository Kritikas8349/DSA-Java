public class ReorderList {
    
        public void reorderList(ListNode head) {
    
            if (head == null || head.next == null) {
                return;
            }
    
            // Find middle
            ListNode slow = head;
            ListNode fast = head.next;
    
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
    
            // Split into two halves
            ListNode secondHead = slow.next;
            slow.next = null;
    
            // Reverse second half
            ListNode prev = null;
            ListNode cur = secondHead;
    
            while (cur != null) {
                ListNode nextNode = cur.next;
                cur.next = prev;
                prev = cur;
                cur = nextNode;
            }
    
            // Merge the two halves
            ListNode t1 = head;
            ListNode t2 = prev;
    
            while (t2 != null) {
                ListNode m1 = t1.next;
                ListNode m2 = t2.next;
    
                t1.next = t2;
                t2.next = m1;
    
                t1 = m1;
                t2 = m2;
            }
        }
    }

