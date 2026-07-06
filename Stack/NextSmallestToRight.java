import java.util.Arrays;
import java.util.Stack;

public class NextSmallestToRight {
    public static void main(String[] args) {
        int[] arr = {4,5,2,10,8};
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            if(st.size()==0){
                ans[i] = -1;
            }

            else if(st.size()>0 && st.peek()<arr[i]){
                ans[i] = st.peek();
            }

            else if(st.size()>0 && st.peek()>=arr[i]){
                while(st.size()>0 && st.peek()>=arr[i]){
                    st.pop();
                }
                if(st.size()==0){
                    ans[i] = -1;
                }
                else{
                    ans[i] = st.peek();
                }
            }
            st.push(arr[i]);
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
