class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        root.left = b;
        root.right = c;
        b.left = d;
        b.right = e;
        c.left = f; 

        // System.out.println(root.val);
        // System.out.println(b.val);
        // System.out.println(c.val);
        // System.out.println(d.val);
        // System.out.println(e.val);
        // System.out.println(f.val);

        display(root);
    }

    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
}
