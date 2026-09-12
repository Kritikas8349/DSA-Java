import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class Zigzag {
    public static void main(String[] args) {
        Node root = new Node(1);

        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node k = new Node(9);

        root.left = b;
        root.right = c;

        b.left = d;
        b.right = e;

        c.left = f;

        f.left = g;
        f.right = h;
        
        g.left = k;

        List<List<Integer>> ans = new ArrayList<>();

        // if (root == null)
        //     System.out.print(ans);


        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int level = 0;

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                Node front = q.remove();
            
                currentLevel.add(front.val);
            
                if (front.left != null)
                    q.add(front.left);
            
                if (front.right != null)
                    q.add(front.right);
            }

            if(level%2!=0){
                reverse(currentLevel);
            }

            ans.add(currentLevel);
            level++;
        }
        System.out.println(ans);
    }

    public static void reverse(List<Integer> list) {
        int i = 0;
        int j = list.size() - 1;
    
        while (i < j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
    
            i++;
            j--;
        }
    } 
}
