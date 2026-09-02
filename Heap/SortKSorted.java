
import java.util.ArrayList;
import java.util.PriorityQueue;

public class SortKSorted {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int ele : arr){
            pq.add(ele);

            if(pq.size() > k ){
                ans.add(pq.poll());
            }
        }
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        System.out.println(ans);
    }
}
