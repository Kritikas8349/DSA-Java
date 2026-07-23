import java.util.LinkedList;
import java.util.Queue;

public class FirstNegative {

    public static LinkedList<Integer> firstNegInt(int arr[], int k) {

        Queue<Integer> que = new LinkedList<>();
        LinkedList<Integer> ans = new LinkedList<>();

        int n = arr.length;

        // Store indices of all negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                que.add(i);
            }
        }

        // Process each window
        for (int i = 0; i <= n - k; i++) {

            // Remove indices that are outside the current window
            while (!que.isEmpty() && que.peek() < i) {
                que.remove();
            }

            // Check if first negative lies inside the current window
            if (!que.isEmpty() && que.peek() <= i + k - 1) {
                ans.add(arr[que.peek()]);
            } else {
                ans.add(0);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        LinkedList<Integer> result = firstNegInt(arr, k);

        System.out.println(result);
    }
}