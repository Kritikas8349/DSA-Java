import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(11);
        st.push(12);
        st.push(13);

        System.out.println(st);

        Stack<Integer> temp = new Stack<>();

        while(!st.isEmpty()){
            int ele = st.pop();
            temp.push(ele);
        }

        System.out.println(temp);

        Stack<Integer> copy = new Stack<>();

        while(!temp.isEmpty()){
            int ele = temp.pop();
            copy.push(ele);
        }

        System.out.println(copy);      //space complexity = O(n)


    }
}
