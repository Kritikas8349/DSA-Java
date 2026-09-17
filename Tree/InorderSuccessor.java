class InorderSuccessor {

    public static int successor(Node root, int key) {

    int succ = -1;

    while (root != null) {

        if (root.val > key) {
            // This node can be successor
            succ = root.val;

            // Try to find a smaller value still greater than key
            root = root.left;
        } 
        else {
            // root.val <= key
            // Go right
            root = root.right;
        }
    }

    return succ;
}
    public static void main(String[] args) {

        Node root = new Node(5);

        Node b = new Node(3);
        Node c = new Node(8);
        Node d = new Node(2);
        Node e = new Node(4);
        Node f = new Node(7);
        Node g = new Node(6);

        root.left = b;
        root.right = c;

        b.left = d;
        b.right = e;

        c.left = f;

        f.left = g;

        int key = 4;

        int result = successor(root, key);

        System.out.println("Inorder successor of " + key + " = " + result);
    }
}
