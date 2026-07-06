public class RotateList {
    public ListNode rotateRight(ListNode head, int k){
        if(head==null || head.next==null) return head;

        ListNode temp = head;
        //to calculate n
        int n = 0;
        while(temp!=null){
            temp = temp.next;
            n++;
        }
        k%=n;

        if(head==null || head.next==null || k==0){
            return head;
        }

         ListNode slow = head;
         ListNode fast = head;
        
         //first move the fast k time
         for(int i = 1; i <= k; i++) {
            fast = fast.next;
        }

        //then move both slow and fast by 1
         while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
         }

         ListNode newHead = slow.next;
         slow.next = null;
         fast.next = head;
         return newHead;
    }
}
