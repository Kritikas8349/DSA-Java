
import java.util.Collections;
import java.util.PriorityQueue;



public class KthSmallestEle {
    public static void main(String[] args) {
       int[] arr = {10, 2, 3, 8, -4, -2, 6};
       int k = 3;
    //    PriorityQueue<Integer> pq = new PriorityQueue<>();
    //    for(int i = 0; i < arr.length; i++) {
    //     pq.add(arr[i]);
    //    }
    //    for(int i = 0; i < k; i++) {
    //     pq.poll();
    //    }
    //    System.out.println(pq.peek());

    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       for(int ele : arr){
        pq.add(ele);
        if(pq.size()>k){
           pq.poll(); 
        }
       } 
       System.out.println(pq.peek());
    }
}
