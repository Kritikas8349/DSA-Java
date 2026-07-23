
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax {
        public int[] maxSlidingWindow(int[] nums, int k) {
    
            int n = nums.length;
            int[] ans = new int[n - k + 1];
    
            Deque<Integer> dq = new LinkedList<>();
    
            // Process every element
            for (int i = 0; i < n; i++) {
    
                // Remove indices that are out of the current window
                if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                    dq.pollFirst();
                }
    
                // Remove all smaller elements from the back
                while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                    dq.pollLast();
                }
    
                // Add current index
                dq.offerLast(i);
    
                // Store answer once the first window is completed
                if (i >= k - 1) {
                    ans[i - k + 1] = nums[dq.peekFirst()];
                }
            }
    
            return ans;
        }
    
}
