// import java.util.Stack;
// import java.util.Vector;

// public class NextLargestElement {
//     public static void main(String[] args) {
//         int[] arr = {1, 3, 2, 4}; 
//         Vector<Integer> v = new Vector<>();
//         Stack<Integer> s = new Stack<>();

//         for(int i=arr.length-1; i>=0; i--){
//             if(s.size()==0){
//                 v.add(-1);
//         }

//         else if(s.size()>0 && s.peek()>arr[i]){
//             v.add(s.peek());
//         }
//         else if(s.size()>0 && s.peek()<=arr[i]){
//             while(s.size()>0 && s.peek()<=arr[i]){
//                 s.pop();
//             }
//             if(s.size()==0){
//                 v.add(-1);
//             }
//             else{
//                 v.add(s.peek());
//             }
//         }
//         s.push(arr[i]); 

//         }
//         System.out.println(v);
//     }
// }

//method 2

import java.util.Stack;
import java.util.Arrays;

public class NextLargestElement {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 2, 4 };
        int[] ans = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = s.peek();
            }

            s.push(arr[i]);
        }

        int left = 0;
        int right = ans.length - 1;

        while (left < right) {
            int temp = ans[left];
            ans[left] = ans[right];
            ans[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(ans));
    }
}