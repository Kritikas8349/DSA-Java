public class SumOfTreeNodes {

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

        System.out.println("Sum = " + sum(root));
        System.out.println("Max = " + max(root));
        System.out.println("Product = " + product(root));
        System.out.println("Size = " + size(root));
        System.out.println("Level = " + level(root));
    }


    //SUM
    public static int sum(Node root) {
        if (root == null)
            return 0;

        return root.val + sum(root.left) + sum(root.right);
    }

    //SIZE
    public static int size(Node root) {
        if (root == null)
            return 0;

        return 1 + size(root.left) + size(root.right);
    }

    //LEVEL
    public static int level(Node root){
        if (root == null)
            return 0;

        return 1 + Math.max(level(root.left), level(root.right));
    }

    //MAXIMUM
    public static int max(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;

        return Math.max(root.val,
                Math.max(max(root.left), max(root.right)));
    }

    //PRODUCT
    public static int product(Node root) {
        if (root == null)
            return 1;

        return root.val * product(root.left) * product(root.right);
    }

    //DISPLAY
    public static void display(Node root) {
        if (root == null)
            return;

        System.out.print(root.val + " ");

        display(root.left);
        display(root.right);
    }
}