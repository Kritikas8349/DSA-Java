import java.util.PriorityQueue;

public class CostTOConnectAllRopes {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 1, 8};
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr){
            pq.add(ele);
        }

        int cost = 0;

        while (pq.size() > 1) {

            int y = pq.remove();
            int x = pq.remove();

            int add = y + x;
            cost += add;
            pq.add(add);
        }

        System.out.println("Minimum Cost = " + cost);
    }
}
