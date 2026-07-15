import java.util.Arrays;
import java.util.Stack;

public class NextGreaterToLeft {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        int[] ans = new int[arr.length];
        
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<arr.length; i++){
            if(st.isEmpty()){
                ans[i] = -1;
            }
            else if(!st.isEmpty() && st.peek()>arr[i]){
                ans[i] = st.peek();
            }
            else if(!st.isEmpty() && st.peek()<=arr[i]){
                while(!st.isEmpty() && st.peek()<=arr[i]){
                    st.pop();
                }
                if(st.isEmpty()) {
                    ans[i] = -1;
                }
                else{
                    ans[i] = st.peek();
                }
            }
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(ans));
    }
}



