import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Arrays;

public class TopKFrequentEle {

    public static int[] topKFrequent(int[] arr, int k) {

        int[] ans = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int ele : arr) {
            if (map.containsKey(ele)) {
                map.put(ele, map.get(ele) + 1);
            } else {
                map.put(ele, 1);
            }
        }

        // Min Heap
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int ele : map.keySet()) {

            int freq = map.get(ele);

            pq.add(new Pair(ele, freq));

            if (pq.size() > k) {
                pq.remove();
            }
        }

        // Store top k elements
        for (int i = 0; i < k; i++) {
            Pair p = pq.remove();
            ans[i] = p.ele;
        }

        return ans;
    }

    public static class Pair implements Comparable<Pair> {

        int ele;
        int freq;

        Pair(int ele, int freq) {
            this.ele = ele;
            this.freq = freq;
        }

        @Override
        public int compareTo(Pair p) {
            return this.freq - p.freq;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 3};
        int k = 2;

        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}