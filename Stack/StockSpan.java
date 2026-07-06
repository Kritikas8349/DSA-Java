import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        int[] ans = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<arr.length; i++){
            if(st.isEmpty()){
                ans[i] = -1;
            }

            else if(arr[i]<arr[st.peek()]){
                ans[i] = i - st.peek();
            }

            else if(arr[i]>arr[st.peek()]){
                while(st.size()>0 && arr[i]>=arr[st.peek()]){
                    st.pop();
                }

                if(st.isEmpty()){
                    ans[i] = i+1;
                }

                else{
                    ans[i] = i- st.peek();
                }
            }

            st.push(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
