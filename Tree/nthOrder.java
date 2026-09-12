import java.util.Scanner;

public class nthOrder {
    static int n;
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
        
        System.out.print("Preorder : ");
        preOrder(root);
        System.out.println();
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // nTHLevel(root, 0);


        for(int x=0; x<=3; x++){
            n=x;
            nTHLevel(root, 0);
            System.out.println();
        }

        sc.close();

    }

    public static void preOrder(Node root){
        if (root == null)
            return;

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void nTHLevel(Node root, int level){
        if (root == null)
            return;

        if (level == n)  System.out.print(root.val + " ");
        nTHLevel(root.left, level+1);
        nTHLevel(root.right, level+1);
    }
}
