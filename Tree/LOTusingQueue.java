import java.util.LinkedList;
import java.util.Queue;

public class LOTusingQueue {
    public static class Pair{
        Node node;
        int level;
        Pair(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }
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
        System.out.println("Level Order Traversal : ");
        LevelOrder(root);
        System.out.println();
        System.out.print("Reverse Level Order Traversal : ");
        LevelOrderReverse(root);

        
    }

    public static void LevelOrder(Node root){
        int prevlevel = 0;
        Queue<Pair> q = new LinkedList<>();
        if (root != null) q.add(new Pair(root, 0));
        while(q.size()>0){
            Pair front = q.remove();
            Node temp = front.node;
            int lvl = front.level;
            if(lvl!=prevlevel){
                System.out.println();
                prevlevel++;
            }
            System.out.print(temp.val + " ");
            if(temp.left!=null) q.add(new Pair(temp.left, lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right, lvl+1));
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
