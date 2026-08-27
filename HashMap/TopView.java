import java.util.*;

public class TopView {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Pair {
        Node node;
        int hd;  // horizontal distance

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void main(String[] args) {

                          /*
        1
       / \
      2   3
     / \   \
    4   5   6
             \
              7
                            */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);
        root.right.right.right = new Node(7);

        topView(root);
    }

    static void topView(Node root) {

        if (root == null) {
            return;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        Queue<Pair> queue = new LinkedList<>();

        // Add root to queue
        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {

            Pair temp = queue.remove();

            Node n = temp.node;
            int hd = temp.hd;

            // First node at this horizontal distance
            if (!map.containsKey(hd)) {
                map.put(hd, n.data);
            }

            if (n.left != null) {
                queue.add(new Pair(n.left, hd - 1));
            }

            if (n.right != null) {
                queue.add(new Pair(n.right, hd + 1));
            }
        }

        // Print from left to right
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>(map);

        for (int value : sortedMap.values()) {
            System.out.print(value + " ");
        }
    }
}