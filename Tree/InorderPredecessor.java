import java.util.ArrayList;
import java.util.List;

class InorderPredecessor {

    // Inorder: Left -> Root -> Right
    public static void inorder(Node root, List<Integer> ans) {
        if (root == null) {
            return;
        }

        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
    }

    // Find inorder predecessor
    public static int inorderPred(Node root, int key) {

        List<Integer> ans = new ArrayList<>();

        // Store inorder traversal
        inorder(root, ans);

        // Find key
        for (int i = 0; i < ans.size(); i++) {

            if (ans.get(i) == key) {

                if (i == 0) {
                    return -1;
                }

                return ans.get(i - 1);
            }
        }

        return -1;
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

        // Create inorder list
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);

        // Print inorder
        System.out.println("Inorder: " + ans);

        // Find predecessor
        int predecessor = inorderPred(root, key);

        System.out.println("Predecessor of " + key + " = " + predecessor);
    }

    // public static int predecessor(Node root, int key) {

    //     int pred = -1;
    
    //     while (root != null) {
    //         if (root.val < key) {
    //             pred = root.val;
    //             root = root.right;
    //         } 
    //         else {
    //             root = root.left;
    //         }
    //     }
    
    //     return pred;
    // }
}