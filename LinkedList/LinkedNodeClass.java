class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}


public class LinkedNodeClass {                                                                                                               
    public static void main(String[] args) {
         Node a = new Node(10);
         Node b = new Node(20);
         Node c = new Node(30);
         Node d = new Node(40);
         Node e = new Node(50);
         Node f = new Node(60);
 
         //linking
         a.next = b;      // a -> b
         b.next = c;      // a -> b -> c
         c.next = d;      // a -> b -> c -> d
         d.next = e;      // a -> b -> c -> d -> e
         e.next = f;      // a -> b -> c -> d -> e -> f

         System.out.println(a.val);
         System.out.println(a.next.val);
         System.out.println(a.next.next.val);
         System.out.println(a.next.next.next.val);
         System.out.println(a.next.next.next.next.val);

    }
}
  