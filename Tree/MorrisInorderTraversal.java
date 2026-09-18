class MorrisInorderTraversal {

    // Tree Node
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // Morris Inorder Traversal
    public static void morrisInorder(TreeNode root) {

        TreeNode curr = root;

        while (curr != null) {

            // Case 1: No left child
            if (curr.left == null) {

                System.out.print(curr.val + " ");

                curr = curr.right;
            }

            // Case 2: Left child exists
            else {

                // Find inorder predecessor
                TreeNode pred = curr.left;

                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                // First time reaching curr
                if (pred.right == null) {

                    // Create temporary link
                    pred.right = curr;

                    // Move to left subtree
                    curr = curr.left;
                }

                // Second time reaching curr
                else {

                    // Remove temporary link
                    pred.right = null;

                    // Visit curr
                    System.out.print(curr.val + " ");

                    // Move to right subtree
                    curr = curr.right;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Creating the tree
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Morris Inorder Traversal
        System.out.println("Morris Inorder Traversal:");

        morrisInorder(root);
    }
}


// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {

//         List<Integer> ans = new ArrayList<>();

//         TreeNode curr = root;

//         while (curr != null) {

//             if (curr.left != null) {

//                 TreeNode pred = curr.left;

//                 // Find inorder predecessor
//                 while (pred.right != null && pred.right != curr) {
//                     pred = pred.right;
//                 }

//                 // First time visiting curr
//                 if (pred.right == null) {

//                     // Create temporary link
//                     pred.right = curr;

//                     // Go to left subtree
//                     curr = curr.left;
//                 }

//                 // Second time visiting curr
//                 else {

//                     // Remove temporary link
//                     pred.right = null;

//                     // Visit curr
//                     ans.add(curr.val);

//                     // Go to right subtree
//                     curr = curr.right;
//                 }
//             }

//             else {

//                 // No left subtree
//                 ans.add(curr.val);

//                 // Go right
//                 curr = curr.right;
//             }
//         }

//         return ans;
//     }
// }