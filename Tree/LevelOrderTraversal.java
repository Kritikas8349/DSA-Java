import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);

        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(16);

        root.left = b;
        root.right = c;

        b.left = d;
        b.right = e;

        c.left = f;

        f.left = g;

        display(root);
        System.out.println();
        System.out.print("Level Order Traversal : ");
        LevelOrder(root);
        System.out.println();
        System.out.print("Reverse Level Order Traversal : ");
        LevelOrderReverse(root);
    }

    public static void LevelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        if (root != null) q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val + " ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
    }

    public static void LevelOrderReverse(Node root){
        Queue<Node> q = new LinkedList<>();
        if (root != null) q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val + " ");
            if(front.right!=null) q.add(front.right);
            if(front.left!=null) q.add(front.left);
            
        }
    }

    public static void display(Node root) {
        if (root == null) 
            return;

        System.out.print(root.val + " ");

        display(root.left);
        display(root.right);
    }
}
